package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Output extends AppCompatActivity {
    public void monitor(View view){
        Intent intent = new Intent(getApplicationContext(),Monitor.class);
        startActivity(intent);
    }
    public void soundbox(View view){
        Intent intent = new Intent(getApplicationContext(),Soundbox.class);
        startActivity(intent);
    }
    public void printer(View view){
        Intent intent = new Intent(getApplicationContext(),Printer.class);
        startActivity(intent);
    }
    public void back(View view){
        Intent intent = new Intent(getApplicationContext(),InputOutputCpu.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
    }
}