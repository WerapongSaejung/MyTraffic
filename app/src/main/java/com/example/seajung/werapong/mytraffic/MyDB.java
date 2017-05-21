package com.example.seajung.werapong.mytraffic;

/**
 * Created by Werapong on 20/5/2560.
 */

public class MyDB {

    //Explicit เริ่มประกาศตัวแปร
    //ต้องมี 3 ก้อนเสมอ
    //1.Access เช่น Public, Private
    //2.Type
    //3.Name
    private String[] titlesStrings = new String[]{"หัวข้อที่ 1", "หัวข้อที่ 2", "หัวข้อที่ 3", "หัวข้อที่ 4",
            "หัวข้อที่ 5", "หัวข้อที่ 6", "หัวข้อที่ 7", "หัวข้อที่ 8", "หัวข้อที่ 9", "หัวข้อที่ 10", "หัวข้อที่ 11", "หัวข้อที่ 12", "หัวข้อที่ 13",
            "หัวข้อที่ 14", "หัวข้อที่ 15", "หัวข้อที่ 16", "หัวข้อที่ 17", "หัวข้อที่ 18", "หัวข้อที่ 19", "หัวข้อที่ 20",};
    private String[] detailStrings;
    private int[] ints = new int[]{R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,
            R.drawable.traffic_04,R.drawable.traffic_05,R.drawable.traffic_06,R.drawable.traffic_07,
            R.drawable.traffic_08,R.drawable.traffic_09,R.drawable.traffic_10,R.drawable.traffic_11,
            R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,
            R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,R.drawable.traffic_19,
            R.drawable.traffic_20,};

    public int[] getInts() {
        return ints;
    }

    public String[] getTitlesStrings() {
        return titlesStrings;
    }

    public String[] getDetailStrings() {

        String[] resulStrings = new String[titlesStrings.length];
        String s = "รายละเอียด ";
        for (int i = 0; i < resulStrings.length; i++) {

            resulStrings[i] = s + titlesStrings[i] + manydetail();

        }//for ตัวที่ 1

        return resulStrings;
    }

    private String manydetail() {
        String s = "";
    for (int i=0; i<10; i++) {
        s = s + "รายละเอียด ";
    }
        return s;
    }

}   // Main Class คราสหลัก

