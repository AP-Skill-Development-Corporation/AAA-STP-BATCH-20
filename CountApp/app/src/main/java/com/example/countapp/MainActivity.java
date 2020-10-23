package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    int count = 0;
    MainViewModel mvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        mvm = new ViewModelProvider(this).get(MainViewModel.class);
        Log.i("APSSDC","ViewModel is Initialized");
        //tv.setText(""+mvm.count);
        mvm.count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv.setText(""+integer);
            }
        });
    }

    public void increment(View view) {
        /*count++;
        tv.setText(""+count);*/
        mvm.increment();
        //tv.setText(""+mvm.count);
    }

    public void resetCount(View view) {
        count = 0;
        tv.setText(""+count);
    }

    public void dicreament(View view) {
        mvm.dicrement();
        //tv.setText(""+mvm.count);
       /* if(count>0){
            count--;
            tv.setText(""+count);
        }*/
    }
}