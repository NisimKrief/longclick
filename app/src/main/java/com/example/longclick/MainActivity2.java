package com.example.longclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1 = (TextView) findViewById(R.id.textView);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);

        Intent gi = getIntent();
        int shortclick = gi.getIntExtra("short", 0);
        int longclick = gi.getIntExtra("long", 0);
        text1.setText("Short Click Points: "+shortclick);
        text2.setText("Long Click Points: "+longclick);
        if(shortclick > longclick){
            text3.setText("The winner is short click!");
        }
        else if(longclick > shortclick){
            text3.setText("The winner is long click!");

        }
        else{
            text3.setText("Draw!");

        }

    }

    public void Back(View view) {
        finish();
    }
}