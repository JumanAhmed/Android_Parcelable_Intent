package com.example.juman.androidparcelableintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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

        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

        intent.putExtra("person", person);
        startActivity(intent);

    }

    // Juman Ahmed Jaki
    // Redwanul Islam
}
