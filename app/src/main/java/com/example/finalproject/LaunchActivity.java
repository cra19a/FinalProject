package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {
    private Button launch_button;
    private Button states_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        launch_button = (Button) findViewById(R.id.button);
        launch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        states_button = (Button) findViewById(R.id.button2);
        states_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openStatesActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openStatesActivity() {
        Intent intent2 = new Intent(this, StatesActivity.class);
        startActivity(intent2);
    }

}