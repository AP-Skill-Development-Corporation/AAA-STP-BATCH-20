package com.example.workmanagertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    OneTimeWorkRequest firstwork;
    OneTimeWorkRequest secondWork;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constraints constraints = new Constraints.Builder().
                setRequiredNetworkType(NetworkType.CONNECTED).build();
        firstwork = new OneTimeWorkRequest.Builder(FirstWork.class).
                setInitialDelay(1, TimeUnit.MINUTES).build();
        secondWork = new OneTimeWorkRequest.Builder(SecondWork.class).
                setConstraints(constraints).build();
    }

    public void clickMe(View view) {
       /* WorkManager.getInstance(this).enqueue(firstwork);
        WorkManager.getInstance(this).enqueue(secondWork);*/
       WorkManager.getInstance(this).beginWith(secondWork).then(firstwork).enqueue();
    }
}