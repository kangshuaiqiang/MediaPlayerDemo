package demo.mediaplayerdemo.com.mediaplayerdemo;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.widget.VideoView;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //查找控件
        VideoView vv = (VideoView) this.findViewById(R.id.videoView);
        //设置路径
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.abc;
        //添加路径
        vv.setVideoURI(Uri.parse(uri));
        //开始播放
        vv.start();
        //设置 播放监听
        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                //播放结束后的动作
                finish();
            }

        });
    }
}
