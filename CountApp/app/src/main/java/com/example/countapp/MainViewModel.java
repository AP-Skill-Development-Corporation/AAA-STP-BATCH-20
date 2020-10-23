package com.example.countapp;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    //int count = 0;
    MutableLiveData<Integer> count = new MutableLiveData<>();
    public MainViewModel() {
        Log.i("APSS","ViewModel is Created");
        count.setValue(0);

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i("APSSDC","ViewModel is destroyed");
    }

    public void increment(){
        //count++;
        count.setValue(count.getValue()+1);
    }

    public void dicrement(){
        //count--;
        count.setValue(count.getValue()-1);
    }
}
