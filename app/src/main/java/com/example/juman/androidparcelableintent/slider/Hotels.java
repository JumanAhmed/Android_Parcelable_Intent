package com.example.juman.androidparcelableintent.slider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.juman.androidparcelableintent.R;

import java.util.List;

public class Hotels extends AppCompatActivity {

    ListView listView;
    List<HotelDataModel> itemList;
    HotelsAdapter hotelsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        listView = (ListView) findViewById(R.id.listview);

        itemList = DataHotels.getAllHotelData();
        hotelsAdapter = new HotelsAdapter(this, itemList);

        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(hotelsAdapter);
        //listView.setTextFilterEnabled(true);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               HotelDataModel hotelItem = (HotelDataModel) adapterView.getItemAtPosition(position);
               Intent intent = new Intent(getApplicationContext(), SingleHotel.class);
               //Toast.makeText(getApplicationContext(), hotelItem.getAddress()+" ", Toast.LENGTH_LONG).show();
                intent.putExtra("hotel", hotelItem);
                startActivity(intent);


           }
       });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            overridePendingTransition(R.anim.slide_enter, R.anim.slide_exit);
            return true;
        }
        return false;
        }
    }

