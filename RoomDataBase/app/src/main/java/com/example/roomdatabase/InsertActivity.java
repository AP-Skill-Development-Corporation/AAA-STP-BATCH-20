package com.example.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {

    EditText name,mail,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        name = findViewById(R.id.studentname);
        mail = findViewById(R.id.studentmail);
        phone = findViewById(R.id.studentphone);

    }

    public void saveData(View view) {
        String username = name.getText().toString();
        String usermail = mail.getText().toString();
        String userphone = phone.getText().toString();

        Student student = new Student();
        student.setName(username);
        student.setMailID(usermail);
        student.setPhone(userphone);

        //MainActivity.dataBase.myDao().insert(student);

        MainActivity.viewModel.insert(student);

        Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show();
        finish();
    }
}