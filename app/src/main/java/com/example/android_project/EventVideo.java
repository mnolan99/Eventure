package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class EventVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_video);
        int myVideo = getIntent().getIntExtra("myVideo",1);
        VideoView videoViewComedy = findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + myVideo;
        Uri uri = Uri.parse(path);
        videoViewComedy.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoViewComedy.setMediaController(mediaController);
        mediaController.setAnchorView(videoViewComedy);
        videoViewComedy.start();
    }

}