package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class register extends AppCompatActivity {
    private Button regButton;
    private TextView signinText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        regButton = (Button) findViewById(R.id.buttonRegisterSubmit);
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(register.this,
                        explore_recycle_view.class));
            }
        });

        signinText2 = (TextView) findViewById(R.id.SigninTextView2);
        signinText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(register.this,
                        login.class));


            }
        });
    }
}