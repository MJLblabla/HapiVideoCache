package com.hapi.hapivideocache

import android.media.MediaPlayer.OnCompletionListener
import android.media.MediaPlayer.OnPreparedListener
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.hapi.hapivideocache.App.getProxy
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  mVideoView.setVideoPath(file.getAbsolutePath()) //设置视频文件

        mVideoView.setOnPreparedListener(OnPreparedListener {
          Log.d("mVideoView","setOnPreparedListener")
            //视频加载完成,准备好播放视频的回调
        })
        mVideoView.setOnCompletionListener(OnCompletionListener {
            //视频播放完成后的回调
            Log.d("mVideoView","setOnCompletionListener")
        })


        button.setOnClickListener {
            val proxy = getProxy(this)
            val proxyUrl = proxy.getProxyUrl("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4") //设置视
            //mVideoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4") //设置视
            mVideoView.setVideoPath(proxyUrl) //设置视
            mVideoView.start()
        }


        button3.setOnClickListener {
            val proxy = getProxy(this)
            proxy.preLoad("http://vfx.mtime.cn/Video/2019/03/18/mp4/190318214226685784.mp4",10)
        }

        button2.setOnClickListener {

            val proxy = getProxy(this)
            val proxyUrl = proxy.getProxyUrl("http://vfx.mtime.cn/Video/2019/03/18/mp4/190318214226685784.mp4")
            mVideoView.setVideoPath(proxyUrl) //设置视
        }
    }


}
