package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Ed1 = findViewById(R.id.ET1);
        EditText Ed2 = findViewById(R.id.ET2);
        EditText Ed3 = findViewById(R.id.ET3);
        EditText Ed4 = findViewById(R.id.ET4);
        Button add = findViewById(R.id.add);
        TextView t = findViewById(R.id.result);
        Button minus = findViewById(R.id.minus);
        Button calculate = findViewById(R.id.calculate);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int num3 = Integer.parseInt(Ed3.getText().toString());
                int num4 = Integer.parseInt(Ed4.getText().toString());
                equal = totalGrade(num1,num2,num3,num4);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int num3 = Integer.parseInt(Ed3.getText().toString());
                int num4 = Integer.parseInt(Ed4.getText().toString());
                equal = num1 - num2 - num3 - num4;
            }
        });




        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText(equal + " ");
            }
        });
    }

    public static int totalGrade(int num1,int num2,int num3,int num4){
        return num1 + num2 + num3 + num4;

    }
}