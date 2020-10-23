package com.example.brtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String CUSTOM_ACTION = "Mastan.From.APSSDC";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyReceiver receiver = new MyReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_POWER_CONNECTED);
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED);
        filter.addAction(CUSTOM_ACTION);
        registerReceiver(receiver,filter);

    }

    public void sendCustomBR(View view) {
        Intent i = new Intent(CUSTOM_ACTION);
        sendBroadcast(i);
    }
}