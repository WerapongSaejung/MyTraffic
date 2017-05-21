package com.example.seajung.werapong.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Werapong on 21/5/2560.
 */

public class MyAdapter extends BaseAdapter{

    private Context context; //ทำหน้าที่ในการเชื่อมต่อ
    private String[] titleStrings,detailString;
    private int[] ints;
    private TextView titleTextView, detailTextView;
    private ImageView imageView;

    public MyAdapter(Context context, String[] titleStrings, String[] detailString, int[] ints) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.detailString = detailString;
        this.ints = ints;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.listview_layout, parent, false);

        //Initial View
        titleTextView = (TextView) view.findViewById(R.id.txtTitle);
        detailTextView = (TextView) view.findViewById(R.id.txtDetail);
        imageView = (ImageView) view.findViewById(R.id.invIcon);

        // Show View
        titleTextView.setText(titleStrings[position]);

        String strShortDetail = detailString[position].substring(0, 35) + " ...";
        detailTextView.setText(strShortDetail);

        imageView.setImageResource(ints[position]);

        return view;
    }
} // Main Class
