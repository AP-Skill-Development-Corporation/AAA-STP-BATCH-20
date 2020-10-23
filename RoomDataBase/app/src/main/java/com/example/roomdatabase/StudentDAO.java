package com.example.roomdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {

    @Insert
    public void insert(Student student);

    @Query("Select * from StudentInfo")
    public LiveData<List<Student>> readData();

    @Delete
    public void delete(Student student);
}
