# ChopperBot项目框架

## 项目介绍


>一款全自动的主播切片机器人,支持模块热度分析, 主播热度分析,智能爬取,弹幕视频爬取,弹幕分析, 自动切片,切片分类,自动标题,自动封面,账号打造,账号管理, 多平台上传等功能

## 模块介绍
![image](https://mynoteimages.oss-cn-hangzhou.aliyuncs.com/20230419223557838.png)

### 爬虫引擎 [CreeperModule]:
介绍：支持多直播网站的爬虫引擎，多线程高效爬取，支持弹幕爬取，支持视频

#### 待完成功能：
- [ ] 多直播网站信息爬虫
- [ ] 弹幕爬取
- [ ] 直播流爬取
- [ ] 多线程爬取
- [ ] 自动登录，账号信息获取
- [ ] 数据持久化

### 热度分析模块 [HotModule]:
介绍：支持多直播网站的热度分析，支持主播热度分析，支持模块热度分析

#### 待完成功能：
- [ ] 主播热度分析: 通过当前直播间热度，自动推荐热度最高的N位主播
- [ ] 模块热度分析：总和板块热度，自动推荐热度最高的N个板块
- [ ] 跟风模式：根据当前热度最高的主播，最高的模块，自动爬取

### 弹幕分析模块 [BarrageModule]：
介绍：支持弹幕统计，支持自定义弹幕关键词评分，弹幕关键词分析，弹幕偏向分类，优质弹幕

#### 待完成功能：
- [ ] 弹幕关键词评分：根据自定义弹幕关键词和弹幕数量对整个一个时间板块的弹幕进行评分
- [ ] 弹幕偏向分类：根据弹幕的类型，对弹幕进行分类，方便对之后的切片模块进行分类
- [ ] 弹幕评分曲线图：根据弹幕评分，绘制弹幕评分曲线图，方便观看
- [ ] 实时视频板块：根据弹幕评分曲线图，实时浏览当前切片的视频


### 切片模块 [SectionModule]：
介绍：支持自动切片，支持切片分类

#### 待完成功能：
- [ ] 自动切片：根据弹幕评分曲线图，自动选取弹幕评分量最高的区间进行切片
- [ ] 切片分类：根据弹幕偏向分类，对切片进行分类
- [ ] 切片保存：将切片保存到本地
- [ ] 切片管道：根据不同的分类，为每个分类创建一个管道，将切片保存到不同的管道中并推送至绑定管道的账号

### 切片打磨模块 [SectionWorkModule]：
介绍：切片通道默认连接切片打磨模块，支持自动标题，支持自动封面，支持自动剪辑

#### 待完成功能：
- [ ] 自动标题：根据切片的弹幕关键词，自动为切片生成标题
- [ ] 自动封面：选取弹幕评分峰值的切片，作为图片，手动生成封面
- [ ] 自动剪辑：AI自动剪辑，（暂未想好）

### 文件模块 [FileModule]：
介绍：支持文件上传，支持文件下载，支持文件管理，信息持久化

#### 待完成功能：
- [ ] 一套完整的文件操控工具
- [ ] 远端文件上传：支持将本地文件上传至远端服务器
- [ ] 远端文件下载：支持将远端服务器的文件下载至本地
- [ ] 远端文件管理：支持对远端服务器的文件进行管理
- [ ] 删除机制：过期文件自动删除
- [ ] 信息持久化：支持对各个模块的专属信息进行持久化


### 账号模块 [AccountModule]：
介绍：支持账号管理，支持账号打造

#### 待完成功能：
-[ ] 多平台账号管理：支持多平台账号的管理（抖音，b站，youtube）
-[ ] 账号打造：通过对账号的分类设定，选取切片通道进行绑定，自动将切片推送至绑定的账号
-[ ] 账号数据：支持对账号的数据进行分析，包括粉丝数，点赞数，评论数，转发数，观看数等（优先级低）

### 发布模块:

#### 待完成功能：
-[ ] 多平台发布：支持多平台的发布（抖音，b站，youtube）


