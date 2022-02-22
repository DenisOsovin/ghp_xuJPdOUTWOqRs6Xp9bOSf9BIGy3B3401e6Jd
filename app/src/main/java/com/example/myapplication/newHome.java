package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class newHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_home);

        Intent myIntent= getIntent();
        if(myIntent !=null && myIntent.hasExtra(MainActivity.CalcButtonStyle))
        {
            //String name=myIntent.getStringExtra(MainActivity.CalcButtonStyle);
            CalcButtonStyle.setText();
        }
    }
}