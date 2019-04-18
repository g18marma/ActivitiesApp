package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    private static final String TAG = "MountainDetailsActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        TextView incomingData = (TextView) findViewById(R.id.text123);
        Log.d(TAG, "onCreate: Started");

        Intent incomingIntent = getIntent();
        String incomingName = incomingIntent.getStringExtra("berg");
        Log.d(TAG, "onCreate: Found incoming name: " + incomingName);

        incomingData.setText(incomingName);

    }
}
