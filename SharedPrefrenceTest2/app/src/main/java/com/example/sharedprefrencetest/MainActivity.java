package com.example.sharedprefrencetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_mobile;
    TextView tv;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.name);
        et_mobile = findViewById(R.id.mobile);
        tv = findViewById(R.id.textview);
        preferences = getPreferences(MODE_PRIVATE);
    }

    public void save(View view) {
        //If you want to write the data into the sharedPrefrences ther is a class
        //called Editor
        String name = et_name.getText().toString();
        String mobile = et_mobile.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("key1",name);
        editor.putString("key2",mobile);
        editor.commit();
        Toast.makeText(this,
                "Deatails saved successfully!", Toast.LENGTH_SHORT).show();

    }

    public void retrive(View view) {
        String myname = preferences.getString("key1","data not found");
        String myMobile = preferences.getString("key2","data not found");
        tv.setText(myname+" "+myMobile);
    }
}