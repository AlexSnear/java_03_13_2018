package com.example.snear.java_03_13_2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button myButton, thirdBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.my_button);
        myButton.setOnClickListener(this);
        thirdBtn = findViewById(R.id.third_button);
        thirdBtn.setOnClickListener(this);
    }

    public void myButtonClick(View view) {
        Log.d("MY_TAG", "Was clicked my Button");
    }

    @Override
    public void onClick(View v) {
        Log.d("MY_TAG", "onClick: asdscgsadf");
        if (v.getId() == R.id.my_button) {
            Log.d("MY_TAG", "onClick: second btn");
        } else if (v.getId() == R.id.third_button) {
            Log.d("MY_TAG", "onClick: third btn");
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}
