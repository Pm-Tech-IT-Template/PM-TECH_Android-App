package com.example.media;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mySound;
    Button ms1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound=MediaPlayer.create(this,R.raw.ct);
        System.out.println(mySound);

        mySound.start();
        mySound.setLooping(true);

        ms1 = (Button) findViewById(R.id.btnnext);
        ms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ms1 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(ms1);
                mySound.stop();
            }
        });
    }
}