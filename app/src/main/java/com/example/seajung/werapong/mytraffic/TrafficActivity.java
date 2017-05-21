package com.example.seajung.werapong.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TrafficActivity extends AppCompatActivity {


    // Explicit
    private MyDB myDB;
    private String[] titleStrings, detailStrings;
    private int[] ints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);

        //Get Value for MyDB
        getValueMyDB();

    }// Main Method

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
