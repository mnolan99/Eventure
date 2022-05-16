package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class eventNameComedy extends AppCompatActivity {
    private Button ticket;
    private Button videoComedy;
    private ImageButton EventNameComedyPersonButton;
    private ImageButton eventComedySearchButton;
    private ImageButton eventComedyYourEventsButton;
    private ImageButton eventComedyMapButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_name_comedy);

        ticket = (Button) findViewById(R.id.ticketButtonView);
        ticket.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameComedy.this,
                        ticket_comedy.class));
            }
        });

        videoComedy = (Button) findViewById(R.id.videoViewButton);
        videoComedy.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameComedy.this,
                        comedy_video.class));
            }
        });

        EventNameComedyPersonButton = (ImageButton) findViewById(R.id.imageButton18);
        EventNameComedyPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameComedy.this,
                        account_details.class));

            }
        });

        eventComedySearchButton = (ImageButton) findViewById(R.id.imageButton16);
        eventComedySearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameComedy.this,
                        search.class));

            }
        });

        eventComedyYourEventsButton = (ImageButton) findViewById(R.id.imageButton19);
        eventComedyYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameComedy.this,
                        yourEvents.class));

            }
        });

        eventComedyMapButton = (ImageButton) findViewById(R.id.imageButton17);
        eventComedyMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(eventNameComedy.this,
                        map.class));

            }
        });
    }
}