# HapiVideoCache

# HapiAndroidVideoCache
Cache support for any video player with help of single line
## 在原fork项目上添加功能 ##

 - 脱离播放器提前缓存百分比，适用于短视频列表秒开场景　－－－－－－＞播放当前视频提前预加载下一个视频百分之几，当正式播放时如果没有缓冲完成会取消缓存正式播下边播，已缓存部分有效

使用：

     val proxy = getProxy(this)
            proxy.preLoad("http://vfx.mtime.cn/Video/2019/03/18/mp4/190318214226685784.mp4",10)　//提前加载百分１０
            
            
              val proxyUrl = proxy.getProxyUrl("http://vfx.mtime.cn/Video/2019/03/18/mp4/190318214226685784.mp4")
            mVideoView.setVideoPath(proxyUrl) //　滑动到时候正式播放
            
