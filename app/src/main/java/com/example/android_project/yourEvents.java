package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class yourEvents extends AppCompatActivity {

    private ImageView comedyImage;
    private ImageView musicImage;
    private ImageButton yourEventsPersonButton;
    private ImageButton yourEventsSearchButton;
    private ImageButton yourEventsEventsButton;
    private ImageButton yourEventsMapButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_events);

        comedyImage = (ImageView) findViewById(R.id.comedyImageView2);
        comedyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(yourEvents.this,
                        eventNameComedy.class));


            }
        });

        musicImage = (ImageView) findViewById(R.id.musicImageView2);
        musicImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(yourEvents.this,
                        eventNameMusic.class));

            }
        });

        yourEventsPersonButton = (ImageButton) findViewById(R.id.imageButtonExplorePerson2);
        yourEventsPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(yourEvents.this,
                        account_details.class));

            }
        });


        yourEventsSearchButton = (ImageButton) findViewById(R.id.imageButton22);
        yourEventsSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(yourEvents.this,
                        search.class));

            }
        });

        yourEventsEventsButton = (ImageButton) findViewById(R.id.imageButton20);
        yourEventsEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(yourEvents.this,
                        yourEvents.class));

            }
        });

        yourEventsMapButton = (ImageButton) findViewById(R.id.imageButton21);
        yourEventsMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(yourEvents.this,
                        map.class));

            }
        });
    }
}