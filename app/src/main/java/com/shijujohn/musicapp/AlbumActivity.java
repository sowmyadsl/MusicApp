package com.shijujohn.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        Button buttonNowPlaying = (Button) findViewById(R.id.button_now_playing_return);
        buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(AlbumActivity.this, PlayNowActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
