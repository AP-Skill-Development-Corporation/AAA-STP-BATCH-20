package com.example.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1)
public abstract class MyDataBase extends RoomDatabase {

    public abstract StudentDAO myDao();

    public static MyDataBase dataBase;

    public static synchronized MyDataBase getDataBase(Context context){
        if (dataBase == null){
            dataBase = Room.databaseBuilder(context,MyDataBase.class,"MyDB")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return dataBase;
    }
}
