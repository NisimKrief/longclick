package com.example.longclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    int shortclick, longclick;
    Button shortbutton, longbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shortbutton = (Button) findViewById(R.id.button);
        longbutton = (Button) findViewById(R.id.button2);

        longclick = 0;
        shortclick = 0;

        shortbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shortclick++;

            }
        });
        longbutton.setOnLongClickListener(this);

    }

    @Override
    public boolean onLongClick(View v) {
        longclick += 2;
        return false;
    }

    public void Go(View view) {
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("short", shortclick);
        si.putExtra("long", longclick);
        shortclick = 0;
        longclick = 0;
        startActivity(si);
    }
}