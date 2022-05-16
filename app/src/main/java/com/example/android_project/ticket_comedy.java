package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ticket_comedy extends AppCompatActivity {
    private Button covidStatus;
    private ImageButton TicketComedyPersonButton;
    private ImageButton ticketComedySearchButton;
    private ImageButton ticketComedyYourEventsButton;
    private ImageButton ticketComedyMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_comedy);

        covidStatus = (Button) findViewById(R.id.covidButton2);
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

        TicketComedyPersonButton = (ImageButton) findViewById(R.id.imageButton10);
        TicketComedyPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_comedy.this,
                        account_details.class));

            }
        });


      ticketComedySearchButton = (ImageButton) findViewById(R.id.imageButton2);
        ticketComedySearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_comedy.this,
                        search.class));

            }
        });

        ticketComedyYourEventsButton = (ImageButton) findViewById(R.id.imageButton11);
        ticketComedyYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_comedy.this,
                        yourEvents.class));

            }
        });

        ticketComedyMapButton = (ImageButton) findViewById(R.id.imageButton9);
        ticketComedyMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(ticket_comedy.this,
                        map.class));

            }
        });
    }
}