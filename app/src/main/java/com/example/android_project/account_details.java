package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class account_details extends AppCompatActivity {

    private Button editButton;
    private Button editButton2;
    private Button accountContactButton;
    private ImageButton accountPersonButton;
    private ImageButton accountSearchButton;
    private ImageButton accountYourEventsButton;
    private ImageButton accountMapButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_details);

        editButton = (Button) findViewById(R.id.editButton);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                Toast.makeText(getApplicationContext(),"Unfortunately you cannot edit your personal details at this time.",Toast.LENGTH_SHORT).show();

            }
        });

        editButton2 = (Button) findViewById(R.id.editButton2);
        editButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                Toast.makeText(getApplicationContext(),"Unfortunately you cannot edit your payment methods at this time.",Toast.LENGTH_SHORT).show();

            }
        });

        accountPersonButton = (ImageButton) findViewById(R.id.imageButton6);
        accountPersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(account_details.this,
                        account_details.class));

            }
        });

        accountSearchButton = (ImageButton) findViewById(R.id.imageButton5);
        accountSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(account_details.this,
                        search.class));

            }
        });

        accountYourEventsButton = (ImageButton) findViewById(R.id.imageButton7);
        accountYourEventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(account_details.this,
                        yourEvents.class));

            }
        });

        accountMapButton = (ImageButton) findViewById(R.id.imageButton8);
        accountMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(account_details.this,
                        map.class));

            }
        });

        accountContactButton = (Button) findViewById(R.id.contactUsButton);
        accountContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(account_details.this,
                        contact.class));

            }
        });
    }
}