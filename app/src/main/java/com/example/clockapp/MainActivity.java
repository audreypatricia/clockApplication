package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        TextClock jkt_tz = findViewById(R.id.jkt_tz) ;
        jkt_tz.setTimeZone("GMT+07");



        TextClock bali_tz = findViewById(R.id.bali_tz) ;
        bali_tz.setTimeZone("GMT+08");

        TextClock nz_tz = findViewById(R.id.nz_tz) ;
        nz_tz.setTimeZone("GMT+13");

        TextClock tokyo_tz = findViewById(R.id.tokyo_tz) ;
        tokyo_tz.setTimeZone("GMT+09");

        View set24HourButton = findViewById(R.id.set24HourButton);
        set24HourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
