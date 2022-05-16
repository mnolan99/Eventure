package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class explore_recycle_view extends AppCompatActivity {

    ImageButton explorePersonButton,exploreSearchButton, yourEventsMapButton;


    RecyclerView recyclerView;
    String s1[]; String s2 [];String s3 [];
    int images[] = {R.drawable.comedy,R.drawable.swg3,R.drawable.trnsmt,R.drawable._hours};
    int videos[] = {R.raw.comedy_video,R.raw.patrick_topping_video,R.raw.trnsmt,R.raw.winter_weekender};
    double coordinates[][] = {{55.833008, -4.451449},{55.863578, -4.257272},{55.849327, -4.236358},{55.851212495620594, -4.259236197332103}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_recycle_view);

        s1 = getResources().getStringArray(R.array.events);
        s2 = getResources().getStringArray(R.array.places);
        s3 = getResources().getStringArray(R.array.descriptions);

        recyclerView = findViewById(R.id.recycleview);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,s3,images,videos,coordinates);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Spinner spinner = (Spinner) findViewById(R.id.filter_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.filter_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        explorePersonButton = (ImageButton) findViewById(R.id.imageButtonExplorePerson);
        explorePersonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore_recycle_view.this,
                        account_details.class));

            }
        });



        exploreSearchButton = (ImageButton) findViewById(R.id.imageButtonSearch);
        exploreSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore_recycle_view.this,
                        search.class));

            }
        });

        yourEventsMapButton = (ImageButton) findViewById(R.id.imageButtonPosition);
        yourEventsMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // connecting this main activity with the second activity
                startActivity(new Intent(explore_recycle_view.this,map.class));

            }
        });

    }


}
/*
public class explore_recycle_view extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[]; String s2 [];
    int images[] = {R.drawable.comedy,R.drawable.swg3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_recycle_view);

        s1 = getResources().getStringArray(R.array.events);
        s2 = getResources().getStringArray(R.array.places);

        recyclerView = findViewById(R.id.recycleview);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}*/