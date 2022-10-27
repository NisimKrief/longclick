package com.example.longclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent gi = getIntent();
        int shortclick = gi.getIntExtra("short", 0);
        int longclick = gi.getIntExtra("long", 0);

    }
}