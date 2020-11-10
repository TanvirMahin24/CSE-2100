package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

public class DvdRoom extends AppCompatActivity {
    public void back(View view){
        Intent intent = new Intent(getApplicationContext(), Input.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dvd_room);
    }
}
