package com.example.roomdatabase;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;

import java.util.List;

public class MyRepository {

    public LiveData<List<Student>> readData;
    public MyDataBase dataBase;

    public MyRepository(Application application) {
        dataBase = MyDataBase.getDataBase(application);
        readData = dataBase.myDao().readData();
    }

    public void insertData(Student student){
        new InsertTask().execute(student);
    }

    public void deleteData(Student student){
        new DeleteTask().execute(student);
    }

    public LiveData<List<Student>> readData(){
        return readData;
    }

    class InsertTask extends AsyncTask<Student,Void,Void> {

        @Override
        protected Void doInBackground(Student... students) {
            dataBase.myDao().insert(students[0]);
            return null;
        }
    }

    class DeleteTask extends AsyncTask<Student,Void,Void>{

        @Override
        protected Void doInBackground(Student... students) {
            dataBase.myDao().delete(students[0]);
            return null;
        }
    }

}
