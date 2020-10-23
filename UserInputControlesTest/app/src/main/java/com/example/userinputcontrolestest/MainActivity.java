package com.example.userinputcontrolestest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_name,et_mobile,et_email,et_pass;
    TextView tv;
    RadioButton r_male,r_female;
    CheckBox ch_java,ch_android,ch_python;
    Spinner sp;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.nameEdittext);
        et_mobile = findViewById(R.id.mobileEdittext);
        et_email = findViewById(R.id.emailEditText);
        et_pass = findViewById(R.id.passwordEditText);
        r_male = findViewById(R.id.maleRadiButton);
        r_female = findViewById(R.id.femaleRadiButton);
        ch_java = findViewById(R.id.javaCheckbox);
        ch_android = findViewById(R.id.androidCheckbox);
        ch_python = findViewById(R.id.pythonCheckbox);
        sp = findViewById(R.id.spinner);
        tv = findViewById(R.id.textview);
    }

    public void submit(View view) {
        String name = et_name.getText().toString();
        String mobileno = et_mobile.getText().toString();
        String email = et_email.getText().toString();
        String pass = et_pass.getText().toString();
        if(r_male.isChecked()){
            gender = r_male.getText().toString();
        }else if(r_female.isChecked()){
            gender = r_female.getText().toString();
        }

        StringBuilder builder = new StringBuilder();
        if(ch_java.isChecked()){
            builder.append(ch_java.getText().toString()+",");
        }
        if(ch_android.isChecked()){
            builder.append(ch_android.getText().toString()+",");
        }
        if(ch_python.isChecked()){
            builder.append(ch_python.getText().toString());
        }

        String selectedBranch = sp.getSelectedItem().toString();

        tv.setText(name+"\n"+mobileno+"\n"+email+"\n"+pass+"\n"
                +gender+"\n"+builder+"\n"+selectedBranch);
    }
}