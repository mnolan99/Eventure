package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button regButton;
    private TextView signinText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regButton = (Button) findViewById(R.id.buttonSignin);
        regButton.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             // connecting this main activity with the second activity
                                             startActivity(new Intent(MainActivity.this,
                                                     register.class));
                                         }
                                     });

                signinText = (TextView) findViewById(R.id.signinTextView);
                signinText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // connecting this main activity with the second activity
                        startActivity(new Intent(MainActivity.this,
                                login.class));


                }
                });
    }
}