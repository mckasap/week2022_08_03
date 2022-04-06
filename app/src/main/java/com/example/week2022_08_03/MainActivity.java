package com.example.week2022_08_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new
                IntentFilter("android.intent.action.AIRPLANE_MODE");

        registerReceiver( new MyBroadcastReceiver(),  intentFilter);
    }
}