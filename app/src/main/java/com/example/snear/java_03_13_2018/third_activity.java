package com.example.snear.java_03_13_2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class third_activity extends AppCompatActivity implements View.OnClickListener {

    private Button four_act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);
        four_act = findViewById(R.id.button_four_activity);
        four_act.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.d("MY_TAG", "onClick: Was clicked button to switch activity four");
        Intent intent = new Intent(this, four_activity.class);
        startActivity(intent);
    }
}
