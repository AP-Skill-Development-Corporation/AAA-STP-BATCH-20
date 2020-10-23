package com.example.roomdatabasetest;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "studentinfo")
public class Student {

    String name;
    String mailid;

    @PrimaryKey @NonNull
    String phoneno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    @NonNull
    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(@NonNull String phoneno) {
        this.phoneno = phoneno;
    }
}
