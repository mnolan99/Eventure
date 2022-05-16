package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class explore extends AppCompatActivity {

    private ImageView comedyImage;
    private ImageView musicImage;
    private ImageButton explorePersonButton;
    private ImageButton exploreSearchButton;
    private ImageButton exploreYourEventsButton;
    private ImageButton exploreMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        Spinner spinner = (Spinner) findViewById(R.id.filter_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.filter_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        comedyImage = (ImageView) findViewById(R.id.comedyImageView);
        comedyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore.this,
                        eventNameComedy.class));


            }
        });

        musicImage = (ImageView) findViewById(R.id.musicImageView);
        musicImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore.this,
                        eventNameMusic.class));

            }
        });

        explorePersonButton = (ImageButton) findViewById(R.id.imageButtonExplorePerson);
        explorePersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore.this,
                        account_details.class));

            }
        });



                exploreSearchButton = (ImageButton) findViewById(R.id.imageButton4);
        exploreSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore.this,
                        search.class));

            }
        });

        exploreYourEventsButton = (ImageButton) findViewById(R.id.imageButton3);
        exploreYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore.this,
                        yourEvents.class));

            }
        });

        exploreMapButton = (ImageButton) findViewById(R.id.imageButton);
        exploreMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore.this,
                        map.class));

            }
        });

    }
}