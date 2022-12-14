package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
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

        float percentDecimal = (n3/100);
        float individualTip = (n1 * percentDecimal) / n2;
        float result = Math.round(individualTip * 100) / 100.0F;

        total.setText("Tip $" + result + " for each person!");

        // amount + (amount*percentToTip) / people
    }
}