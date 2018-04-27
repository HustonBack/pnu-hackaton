package com.example.misha.studentshelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.the_main);
    }

    public void clickedOnIvents(View view){

    }
    public void clickedOnTimetable(View view){
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), mainActivity.class);
        startActivity(intent);
    }
}
