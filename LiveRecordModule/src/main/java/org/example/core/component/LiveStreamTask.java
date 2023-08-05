package org.example.core.component;

import lombok.Data;
import org.example.core.component.StatusMonitor;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/**
 * 单场直播下载任务
 * @author 燧枫
 * @date 2023/5/19 17:07
*/
@Data
public class LiveStreamTask {

    private String url;
    private Map<String, String> headers;
    private FlvHandle f = new FlvHandle();

    public void start(ExecutorService executor, StatusMonitor statusMonitor, OutputStream fileIO) {
        executor.execute(() -> {
            try {
                URLConnection conn = new URL(this.url).openConnection();
                if (this.headers != null) {
                    for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                        conn.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                try (InputStream in = conn.getInputStream()) {
                    f.parseStream(in, statusMonitor, fileIO);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void terminate() {
        f.terminateDownload();
    }
}

