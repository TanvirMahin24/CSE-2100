package com.tanvirmahin.howcomputerworks;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroVideo extends AppCompatActivity {
    public void next(View view){
        Intent intent = new Intent(getApplicationContext(),Computer.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_computer_video);
        VideoView v = (VideoView) findViewById(R.id.vv_how_comp_works);
        v.setVideoPath("android.resource://"+getPackageName() + "/" + R.raw.computer);
        v.start();
    }
}
