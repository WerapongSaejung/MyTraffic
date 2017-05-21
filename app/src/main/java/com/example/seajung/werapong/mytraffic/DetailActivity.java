package com.example.seajung.werapong.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //for Back
        forBack();

        //Show View

        TextView titleTextView = (TextView) findViewById(R.id.txtTitle);
        TextView DetailTextView = (TextView) findViewById(R.id.txtDetail);
        ImageView trafficImageView = (ImageView) findViewById(R.id.Imvtraffic);

        titleTextView.setText(getIntent().getStringExtra("Title"));
        DetailTextView.setText(getIntent().getStringExtra("Detail"));
        trafficImageView.setImageResource(getIntent().getIntExtra("Image", R.drawable.traffic_01));

    }// Main Method

    private void forBack() {
        ImageView BackImageView = (ImageView) findViewById(R.id.imvback);
        BackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}//Main Class
