package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class music_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_video);


        VideoView videoViewMusic = findViewById(R.id.videoViewMusic);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.patrick_topping_video;
        Uri uri = Uri.parse(path);
        videoViewMusic.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoViewMusic.setMediaController(mediaController);
        mediaController.setAnchorView(videoViewMusic);
        videoViewMusic.start();
    }
}
