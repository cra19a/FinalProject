package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class StatesActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        listView = (ListView)findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Alabama - 19.6%");
        arrayList.add("Alaska - 19.3%");
        arrayList.add("Arizona - 19.5%");
        arrayList.add("Arkansas - 18.9%");
        arrayList.add("California - 17.5%");
        arrayList.add("Colorado - 19.8%");
        arrayList.add("Connecticut - 19.1%");
        arrayList.add("Delaware - 20.7%");
        arrayList.add("Florida - 18.5%");
        arrayList.add("Georgia - 19.5%");
        arrayList.add("Hawaii - 18.8%");
        arrayList.add("Idaho - 19.7%");
        arrayList.add("Illinois - 19.3%");
        arrayList.add("Indiana - 21.0%");
        arrayList.add("Iowa - 19.9%");
        arrayList.add("Kansas - 19.8%");
        arrayList.add("Kentucky - 20.7%");
        arrayList.add("Louisiana - 18.9%");
        arrayList.add("Maine - 20.0%");
        arrayList.add("Maryland - 19.6%");
        arrayList.add("Massachusetts - 19.2%");
        arrayList.add("Michigan - 20.2%");
        arrayList.add("Minnesota - 19.0%");
        arrayList.add("Mississippi - 19.3%");
        arrayList.add("Missouri - 19.8%");
        arrayList.add("Montana - 19.9%");
        arrayList.add("Nebraska - 19.6%");
        arrayList.add("Nevada - 18.8%");
        arrayList.add("New Hampshire - 20.4%");
        arrayList.add("New Jersey - 18.9%");
        arrayList.add("New Mexico - 20.1%");
        arrayList.add("New York - 18.5%");
        arrayList.add("North Carolina - 19.5%");
        arrayList.add("North Dakota - 19.7%");
        arrayList.add("Ohio - 20.7%");
        arrayList.add("Oklahoma - 19.4%");
        arrayList.add("Oregon - 19.3%");
        arrayList.add("Pennsylvania - 20.2%");
        arrayList.add("Rhode Island - 19.8%");
        arrayList.add("South Carolina - 20.3%");
        arrayList.add("South Dakota - 19.4%");
        arrayList.add("Tennessee - 19.5%");
        arrayList.add("Texas - 18.8%");
        arrayList.add("Utah - 19.0%");
        arrayList.add("Vermont - 19.2%");
        arrayList.add("Virginia - 19.7%");
        arrayList.add("Washington - 18.3%");
        arrayList.add("West Virginia - 20.8%");
        arrayList.add("Wisconsin - 20.3%");
        arrayList.add("Wyoming - 20.5%");
        arrayList.add("Study done by Toast: a company behind a touchless point-of-sale payment system used in more than 68,000 restaurants, cafes and coffeehouses nationwide.\nhttps://www.cnet.com/personal-finance/the-worst-tippers-in-the-us-where-does-your-state-rank/");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }
}