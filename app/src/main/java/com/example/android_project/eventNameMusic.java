package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.ImageButton;

public class eventNameMusic extends AppCompatActivity {
    private Button ticket2;
    private Button videoMusic;
    private Button playMusic;
    private MediaPlayer mediaPlayer;
    private ImageButton EventNameMusicPersonButton;
    private ImageButton eventMusicSearchButton;
    private ImageButton eventMusicYourEventsButton;
    private ImageButton eventMusicMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_name_music);

        ticket2 = (Button) findViewById(R.id.ticketButtonView);
        ticket2.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameMusic.this,
                        ticket_music.class));
            }
        });

        videoMusic = (Button) findViewById(R.id.videoViewButton2);
        videoMusic.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameMusic.this,
                        music_video.class));
            }
        });

        EventNameMusicPersonButton = (ImageButton) findViewById(R.id.imageButton14);
        EventNameMusicPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameMusic.this,
                        account_details.class));

            }
        });

        eventMusicSearchButton = (ImageButton) findViewById(R.id.imageButton12);
        eventMusicSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameMusic.this,
                        search.class));

            }
        });

        eventMusicYourEventsButton = (ImageButton) findViewById(R.id.imageButton15);
        eventMusicYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameMusic.this,
                        yourEvents.class));

            }
        });

        eventMusicMapButton = (ImageButton) findViewById(R.id.imageButton13);
        eventMusicMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameMusic.this,
                        map.class));

            }
        });

        mediaPlayer = new MediaPlayer();
        mediaPlayer = MediaPlayer.create(getApplicationContext(),
                R.raw.patrick_topping_song);
        playMusic = (Button) findViewById(R.id.AudioPreviewButton);
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){

//stop and give option to start again
                    pauseMusic();
                }else {
//Start and give option to pause again
                    startMusic();
                }
            }
        });
    }
    public void pauseMusic(){
        if (mediaPlayer != null){
            mediaPlayer.pause();
            playMusic.setText("Audio");
        }
    }
    public void startMusic(){
        if (mediaPlayer != null){
            mediaPlayer.start();
            playMusic.setText("Pause");
        }
    }


}
