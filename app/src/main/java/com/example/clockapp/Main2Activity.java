package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        TextClock syd_time = findViewById(R.id.syd_time);
        syd_time.setFormat12Hour("kk:mm");

        TextClock jkt_time = findViewById(R.id.jkt_tz);
        jkt_time.setTimeZone("GMT+07");
        jkt_time.setFormat12Hour("kk:mm");

        TextClock bali_time = findViewById(R.id.bali_tz);
        bali_time.setTimeZone("GMT+08");
        bali_time.setFormat12Hour("kk:mm");

        TextClock nz_time = findViewById(R.id.nz_tz);
        nz_time.setTimeZone("GMT+13");
        nz_time.setFormat12Hour("kk:mm");

        TextClock tokyo_time = findViewById(R.id.tokyo_tz);
        tokyo_time.setTimeZone("GMT+09");
        tokyo_time.setFormat12Hour("kk:mm");

        View set12HourButton = findViewById(R.id.set12HourButton);
        set12HourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
