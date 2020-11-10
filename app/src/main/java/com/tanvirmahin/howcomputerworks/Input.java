package com.tanvirmahin.howcomputerworks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Input extends AppCompatActivity {
    public void dvd(View view){
        Intent intent = new Intent(getApplicationContext(),DvdRoom.class);
        startActivity(intent);
    }
    public void keyboard(View view){
        Intent intent = new Intent(getApplicationContext(),Keyboard.class);
        startActivity(intent);
    }
    public void mouce(View view){
        Intent intent = new Intent(getApplicationContext(),Mouce.class);
        startActivity(intent);
    }
    public void touchpad(View view){
        Intent intent = new Intent(getApplicationContext(),Touchpad.class);
        startActivity(intent);
    }
    public void back(View view){
        Intent intent = new Intent(getApplicationContext(),InputOutputCpu.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }
}
