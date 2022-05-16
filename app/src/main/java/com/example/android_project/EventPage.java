package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class EventPage extends AppCompatActivity {

    double lat, lon;
    ImageView mainImageView;
    TextView title, description,infos;
    Button videoComedy, getDistanceButton;

    String data1, data2, data3;
    int myImage, myVideo;
    double myCoordinates [];
    TrackGPS trackGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.title);
        infos = findViewById(R.id.infos);
        description = findViewById(R.id.description);
        videoComedy = (Button) findViewById(R.id.videoViewButton_r);
        getDistanceButton = (Button)findViewById(R.id.TrackingButton);

        getData();
        setData();


        videoComedy.setOnClickListener(new View.OnClickListener() {
            @Override

            // This is for testing, will need to be redirected to another page
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(EventPage.this,
                        EventVideo.class));

                Intent intent = new Intent(EventPage.this, EventVideo.class);
                intent.putExtra("myVideo",myVideo);
                EventPage.this.startActivity(intent);
            }
        });

        getDistanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trackGPS = new TrackGPS(EventPage.this);
                if (trackGPS.canGetLocation())
                {
                    String result="Latitude : "+ trackGPS.getLatitude()+" - Longitude  = "+ trackGPS.getLongitude();
                    Toast.makeText(EventPage.this, result, Toast.LENGTH_SHORT).show();
                    String distance="The current distance is "+Distance(trackGPS.getLatitude(),trackGPS.getLongitude(),myCoordinates[0],myCoordinates[1])+" meters";
                    Toast.makeText(EventPage.this, distance, Toast.LENGTH_SHORT).show();
                }
                else{
                    trackGPS.showAlert();
                }
            }
        });

       /* yourEventsMapButton = (ImageButton) findViewById(R.id.imageButtonPosition);
        yourEventsMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(EventPage.this,map.class));

            }
        });*/
    }

    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") &&getIntent().hasExtra("data2"))
        {
           data1 = getIntent().getStringExtra("data1");
           data2 = getIntent().getStringExtra("data2");
           data3 = getIntent().getStringExtra("data3");
           myImage = getIntent().getIntExtra("myImage",1);
           myVideo = getIntent().getIntExtra("myVideo",1);
           myCoordinates = getIntent().getDoubleArrayExtra("myCoordinates");
        }
        else{ Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show(); }
    }

    private void setData(){
    title.setText(data1);
    infos.setText(data2);
    description.setText(data3);
    mainImageView.setImageResource(myImage);

    }

    /*@Override
    protected  void onDestroy(){
        super.onDestroy();
        trackGPS.stopGPS();
    }*/


    // formula to calculate the distance
    double convertRad(double input){
        return (Math.PI * input)/180;
    }

    int Distance(double lat_a_degre, double lon_a_degre, double lat_b_degre, double lon_b_degre){

        double R = 6378000; //Rayon de la terre en mètres

        double lat_a = convertRad(lat_a_degre);
        double lon_a = convertRad(lon_a_degre);
        double lat_b = convertRad(lat_b_degre);
        double lon_b = convertRad(lon_b_degre);

        int d = (int) (R * (Math.PI/2 - Math.asin( Math.sin(lat_b) * Math.sin(lat_a) + Math.cos(lon_b - lon_a) * Math.cos(lat_b) * Math.cos(lat_a))));
        return d;
    }

}