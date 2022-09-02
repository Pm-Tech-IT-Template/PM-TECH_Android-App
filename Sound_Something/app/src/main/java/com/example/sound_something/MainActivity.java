package com.example.sound_something;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView myVDO=(VideoView) findViewById(R.id.video_View);
        myVDO.setVideoURI(Uri.parse("android.resource://" +getPackageName()+"/"+R.raw.vdo));
        myVDO.setMediaController(new MediaController(this));
        myVDO.requestFocus();
        myVDO.start();
    }
}