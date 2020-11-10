package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PowerSupply extends AppCompatActivity {
    public void back(View view){
        Intent intent = new Intent(getApplicationContext(),OtherImportentComponent.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_supply);
    }
}
