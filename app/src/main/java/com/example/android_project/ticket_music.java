package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ticket_music extends AppCompatActivity {
    private Button covidStatus;
    private ImageButton TicketMusicPersonButton;
    private ImageButton ticketMusicSearchButton;
    private ImageButton ticketMusicYourEventsButton;
    private ImageButton ticketMusicMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_music);

        covidStatus = (Button) findViewById(R.id.covidButton);
        covidStatus.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.nhsinform.scot/nhs-scotland-covid-status"));
                startActivity(intent);
            }
        });

        TicketMusicPersonButton = (ImageButton) findViewById(R.id.imageButton6);
        TicketMusicPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_music.this,
                        account_details.class));

            }
        });

        ticketMusicSearchButton = (ImageButton) findViewById(R.id.imageButton5);
        ticketMusicSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_music.this,
                        search.class));

            }
        });

        ticketMusicYourEventsButton = (ImageButton) findViewById(R.id.imageButton7);
        ticketMusicYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_music.this,
                        yourEvents.class));

            }
        });

        ticketMusicMapButton = (ImageButton) findViewById(R.id.imageButton8);
        ticketMusicMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_music.this,
                        map.class));

            }
        });
    }
}