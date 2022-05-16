package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaCas;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class comedy_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedy_video);

        VideoView videoViewComedy = findViewById(R.id.videoViewComedy);
            String path = "android.resource://" + getPackageName() + "/" + R.raw.comedy_video;
            Uri uri = Uri.parse(path);
            videoViewComedy.setVideoURI(uri);

            MediaController mediaController = new MediaController(this);
            videoViewComedy.setMediaController(mediaController);
            mediaController.setAnchorView(videoViewComedy);
        videoViewComedy.start();
        }
    }
