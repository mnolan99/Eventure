package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.BufferedReader;

public class contact extends AppCompatActivity {

    private Button contactSubmitButton;
    private ImageButton contactPersonButton;
    private ImageButton contactSearchButton;
    private ImageButton contactYourEventsButton;
    private ImageButton contactMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        contactSubmitButton = (Button) findViewById(R.id.confirmContactButton);
        contactSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                Toast.makeText(getApplicationContext(),"Unfortunately you cannot contact us at this time.",Toast.LENGTH_SHORT).show();

            }
        });

        contactPersonButton = (ImageButton) findViewById(R.id.imageButtonExplorePerson4);
        contactPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(contact.this,
                        account_details.class));

            }
        });



        contactSearchButton = (ImageButton) findViewById(R.id.imageButton27);
        contactSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(contact.this,
                        search.class));

            }
        });

        contactYourEventsButton = (ImageButton) findViewById(R.id.imageButton26);
        contactYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(contact.this,
                        yourEvents.class));

            }
        });

        contactMapButton = (ImageButton) findViewById(R.id.imageButton28);
        contactMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(contact.this,
                        map.class));

            }
        });
    }
}