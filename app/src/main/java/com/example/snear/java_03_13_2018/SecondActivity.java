package com.example.snear.java_03_13_2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonTriii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttonTriii = findViewById(R.id.my_button3333333);
        buttonTriii.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d("MY_BUTTON_3_ACTYVITY", "onClick: Ebana v ROT");
        Intent intent = new Intent(this, third_activity.class);
        startActivity(intent);
    }
}
