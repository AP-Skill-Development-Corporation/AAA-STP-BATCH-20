package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView rv;

    String[] names = {"Android 1.0 ", "Android 2.0", "Android 3.0",
                    "Android 4.0", "Android 5.0", "Android 6.0","Android 7.0",
                    "Android 8.0","Android 9.0","Android 10"};
    int[] images = {R.drawable.alpha,R.drawable.alpha,R.drawable.alpha,
                R.drawable.alpha,R.drawable.alpha,R.drawable.alpha,R.drawable.alpha,
                R.drawable.alpha,R.drawable.alpha,R.drawable.alpha};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler);

        /*set Style*/
        rv.setLayoutManager(new LinearLayoutManager(this));

        /*Create a Object for your Adapter Class*/
        MyDataAdapter dataAdapter = new MyDataAdapter(this,names,images);
        /*set Adapter*/
        rv.setAdapter(dataAdapter);

    }
}