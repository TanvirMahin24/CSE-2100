package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InputOutputCpu extends AppCompatActivity {
    public void input(View view){
        Intent intent = new Intent(getApplicationContext(),Input.class);
        startActivity(intent);
    }
    public void storage(View view){
        Intent intent = new Intent(getApplicationContext(),Storage.class);
        startActivity(intent);
    }
    public void next(View view){
        Intent intent = new Intent(getApplicationContext(),OtherImportentComponent.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_output_cpu);
    }
}
