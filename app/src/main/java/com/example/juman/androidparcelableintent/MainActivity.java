package com.example.juman.androidparcelableintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.juman.androidparcelableintent.slider.Hotels;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void parcle(View view) {
        Person person = new Person();
        person.setFirstName("Juman");
        person.setLastName("Ahmed Jaki");
        person.setQualification("Computer Engineer");
        person.setHeight(6);
        person.setGender(Person.GENDER.MALE);
        person.setHostelPreference(true);

        List<String> qualifications = new ArrayList<>();
        qualifications.add("SSC From STSC");
        qualifications.add("HSC From STSC");
        qualifications.add("B.sc From Mu");
        person.setQualifications(qualifications);

        List<CityLivedIn> cityLivedIn =new ArrayList<>();
        CityLivedIn cityLivedIn1 =new CityLivedIn();
        cityLivedIn1.setCityName("Sylhet");
        cityLivedIn1.setDate(new Date());

        CityLivedIn cityLivedIn2 = new CityLivedIn();
        cityLivedIn2.setCityName("Dhaka");
        cityLivedIn2.setDate(new Date());

        cityLivedIn.add(cityLivedIn1);
        cityLivedIn.add(cityLivedIn2);

        person.setResidenceHistory(cityLivedIn);


        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        intent.putExtra("person", person);
        startActivity(intent);

    }

    public void gotolist(View view) {
        startActivity(new Intent(getApplicationContext(), Hotels.class));

    }

    // Juman Ahmed Jaki CSE
    // Redwanul Islam
}
