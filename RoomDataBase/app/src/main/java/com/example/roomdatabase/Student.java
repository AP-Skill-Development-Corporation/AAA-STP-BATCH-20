package com.example.roomdatabase;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "StudentInfo")
public class Student {

    String Name;
    String MailID;
    @PrimaryKey @NonNull
    String Phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMailID() {
        return MailID;
    }

    public void setMailID(String mailID) {
        MailID = mailID;
    }

    @NonNull
    public String getPhone() {
        return Phone;
    }

    public void setPhone(@NonNull String phone) {
        Phone = phone;
    }
}
