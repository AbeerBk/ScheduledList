package com.example.scheduledlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity"; //////////////####
    ListView ScheListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:Started.");
         ScheListView = (ListView) findViewById(R.id.ScheduledList);

        ArrayList<String> ScheduledListViewArrayList = new ArrayList<>();
        ScheduledListViewArrayList.add("University of Jeddah ");
        ScheduledListViewArrayList.add("red see mall");


        ArrayAdapter ScheduleAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, ScheduledListViewArrayList);

        ScheListView.setAdapter(ScheduleAdapter);

        ScheListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition = position;

                String itemValue = (String) ScheListView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),
                        "Position: " + itemPosition + "  List Item: " + itemValue, Toast.LENGTH_LONG)
                        .show();
                //  Toast.makeText(MainActivity.this, items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}