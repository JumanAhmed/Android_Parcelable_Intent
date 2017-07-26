package com.example.juman.androidparcelableintent.slider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.juman.androidparcelableintent.R;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class SingleHotel extends AppCompatActivity {

    private static ViewPager mPager;
    //private static int currentPage = 0;
    List<SliderDataModel> images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_hotel);

        HotelDataModel hotel = (HotelDataModel)getIntent().getParcelableExtra("hotel");
        images = hotel.getSliderImages();

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(new MyAdapter(getApplicationContext(),images));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        //textView.setText(hotel.getName()+", "+hotel.getAddress()+", "+hotel.getContact()+", "+
        //hotel.getEmail()+", "+hotel.getLocation());

    }
}
