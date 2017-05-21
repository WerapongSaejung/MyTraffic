package com.example.seajung.werapong.mytraffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TrafficActivity extends AppCompatActivity {


    // Explicit
    private MyDB myDB;
    private String[] titleStrings, detailStrings;
    private int[] ints;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        //Get Value for MyDB
        getValueMyDB();

        //Create List Views
        createListView();

    }// Main Method

    private void createListView() {

        // Initial Views
        listView = (ListView) findViewById(R.id.livtraffic);
        MyAdapter myAdapter = new MyAdapter(this, titleStrings, detailStrings, ints);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(TrafficActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[position]);
                intent.putExtra("Detail", detailStrings[position]);
                intent.putExtra("Image", ints[position]);
                startActivity(intent);

            }
        });

    }

    private void getValueMyDB() {
        myDB = new MyDB();
        titleStrings = myDB.getTitlesStrings();
        detailStrings = myDB.getDetailStrings();
        ints = myDB.getInts();

        // Check Value
        String tag = "21MayV1";
        String tag2 = "21MayV2";

        for (int i = 0; i < titleStrings.length; i++) {
            Log.d(tag, "titleString(" + i + ") ==> " + titleStrings[i]);
            Log.d(tag2, "detailString(" + i + ") ==> " + detailStrings[i]);

        }

    }

}// Main Class
