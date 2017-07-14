package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;


public class CrimePagerActivity extends AppCompatActivity {

    @Override
    public void onCreate( Bundle savedInstanceState,
                          PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_crime_pager);
    }
}
