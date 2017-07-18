package com.example.juman.androidparcelableintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvPerson = (TextView) findViewById(R.id.person);
        Person person = (Person) getIntent().getParcelableExtra("person");

        tvPerson.setText(person.getFirstName()+" "+person.getLastName()+" "+person.getQualification());

    }
}
