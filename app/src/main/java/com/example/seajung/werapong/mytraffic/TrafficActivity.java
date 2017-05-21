package com.example.seajung.werapong.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
