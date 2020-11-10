package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OtherImportentComponent extends AppCompatActivity {
    public void back(View view){
        Intent intent = new Intent(getApplicationContext(),InputOutputCpu.class);
        startActivity(intent);
    }
    public void powerSupply(View view){
        Intent intent = new Intent(getApplicationContext(),PowerSupply.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_importent_component);
    }
}
