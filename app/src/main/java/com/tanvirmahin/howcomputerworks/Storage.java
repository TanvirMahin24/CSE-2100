package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Storage extends AppCompatActivity {
    public void ram(View view){
        Intent intent = new Intent(getApplicationContext(),Ram.class);
        startActivity(intent);
    }
    public void hdd(View view){
        Intent intent = new Intent(getApplicationContext(),Hdd.class);
        startActivity(intent);
    }
    public void phdd(View view){
        Intent intent = new Intent(getApplicationContext(),PHdd.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(getApplicationContext(),InputOutputCpu.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);
    }
}
