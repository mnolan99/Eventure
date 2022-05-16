package com.example.android_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;

public class search extends AppCompatActivity {

    ListView search_event;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_event = (ListView) findViewById(R.id.search_event);

        ArrayList<String> arrayEvent = new ArrayList<>();
        arrayEvent.addAll(Arrays.asList(getResources().getStringArray(R.array.my_events)));

        adapter = new ArrayAdapter<String>(
                search.this,
                android.R.layout.simple_list_item_1,
                arrayEvent
                );
    search_event.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search_event);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}