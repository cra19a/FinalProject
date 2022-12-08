package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // total amount: editTextNumberDecimal
    // people: editTextNumber
    // percent to tip: editTextNumberDecimal2
    // amount to tip (result): editTextNumber2

    public void Calculate(View v) {
        EditText amount = (EditText)findViewById(R.id.editTextNumberDecimal);
        EditText people = (EditText)findViewById(R.id.editTextNumber);
        EditText percent = (EditText)findViewById(R.id.editTextNumberDecimal2);

        EditText total = (EditText)findViewById(R.id.editTextNumber2);

        float n1 = Float.parseFloat(amount.getText().toString());
        float n2 = Float.parseFloat(people.getText().toString());
        float n3 = Float.parseFloat(percent.getText().toString());

        float percentDecimal = n3/100;
        float temp = n1*percentDecimal;

        float result = (n1 + temp) / n2;
        float resultFr = (result * 100) / 100.0F;

        total.setText("Try tipping $" + resultFr + "!");

        // amount + (amount*percentToTip) / people
    }
}