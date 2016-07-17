package com.shijujohn.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Button buttonArtists = (Button) findViewById(R.id.button_artists);
        Button buttonAlbums = (Button) findViewById(R.id.button_albums);
        Button buttonSongs = (Button) findViewById(R.id.button_Songs);
        Button buttonPlayLists = (Button) findViewById(R.id.button_play_list);

        buttonArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(LibraryActivity.this, ArtisitActivity.class);
                startActivity(artistsIntent);
            }
        });
        buttonAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(LibraryActivity.this, AlbumActivity.class);
                startActivity(albumsIntent);
            }
        });
        buttonSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(LibraryActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
        buttonPlayLists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(LibraryActivity.this, PlayListActivity.class);
                startActivity(playlistIntent);
            }
        });


        Button buttonNowPlaying = (Button)findViewById(R.id.button_now_playing_return);
        buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(LibraryActivity.this, PlayNowActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
