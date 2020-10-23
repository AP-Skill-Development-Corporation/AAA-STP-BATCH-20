package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView tv;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.countButton);
        tv = findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tv.setText(String.valueOf(count));

            }
        });

    }

    public void displayToast(View view) {
        //Toast.MakesText(Context,"message",Time duration)
        //Context==>this
        //message==>Welcome to AAD-Workshop
        //Timeduration ==> LENGTH_LONG or LENGTH_SHORT
        Toast.makeText(this,"Welcome to AAD-Workshop",
                Toast.LENGTH_LONG).show();

    }
}