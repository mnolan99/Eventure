package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;

public class login extends AppCompatActivity {
    private TextView registerText;
    private Button logButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        logButton = (Button) findViewById(R.id.buttonLogin);
        logButton.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(login.this,
                        explore_recycle_view.class));
            }
        });

        registerText = (TextView) findViewById(R.id.signinTextView);
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(login.this,
                        register.class));

            }
        });
    }
}
