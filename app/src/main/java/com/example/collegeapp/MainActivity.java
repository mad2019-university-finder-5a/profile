package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        Intent intent= new Intent(this,personal.class);
        startActivity(intent);
    }

    public void click2(View view){
        Intent intent= new Intent(this,academic.class);
        startActivity(intent);
    }


}
