package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    static MyDataBase dataBase;
    List<Student> studentList;

    static MyViewModel viewModel;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*dataBase = Room.databaseBuilder(this,MyDataBase.class,"MyDB")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();*/

        //studentList = dataBase.myDao().readData();
        rv = findViewById(R.id.recycler);

        viewModel = new ViewModelProvider(this).get(MyViewModel.class);

        viewModel.readData().observe(this, new Observer<List<Student>>() {
            @Override
            public void onChanged(List<Student> students) {

                rv.setAdapter(new MyDataAdapter(MainActivity.this,students));
                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }
        });


    }

    public void insertData(View view) {
        Intent i = new Intent(this,InsertActivity.class);
        startActivity(i);
    }
}