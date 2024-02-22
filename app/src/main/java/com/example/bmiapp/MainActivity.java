package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight, edtHeight;
        Button btnSubmit;
        TextView result;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        btnSubmit= findViewById(R.id.btnSubmit);
        result= findViewById(R.id.result);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ht = Integer.parseInt(edtHeight.getText().toString());
                double ht1= ht/100;
                double bmi= wt/(ht1*ht1);
                if (bmi>25)
                {
                    result.setText("Overweight");
                }
                else if (bmi<18)
                {
                    result.setText("Underweight");
                }
                else
                {
                    result.setText("Healthy");
                }

            }
        });


    }
}