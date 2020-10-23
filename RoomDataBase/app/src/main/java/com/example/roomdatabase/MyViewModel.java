package com.example.roomdatabase;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel extends AndroidViewModel {

    public MyRepository repository;
    public LiveData<List<Student>> readData;

    public MyViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
        readData = repository.readData();
    }

    public void insert(Student student){
        repository.insertData(student);
    }

    public void delete(Student student){
        repository.deleteData(student);
    }

    public LiveData<List<Student>> readData(){
        return readData;
    }
}
