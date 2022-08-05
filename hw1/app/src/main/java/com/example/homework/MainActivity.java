package com.example.homework;

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

        EditText Ed1 = findViewById(R.id.ET1);
        EditText Ed2 = findViewById(R.id.ET2);
        EditText Ed3 = findViewById(R.id.ET3);
        EditText Ed4 = findViewById(R.id.ET4);
        Button b = findViewById(R.id.calculate);
        TextView t = findViewById(R.id.result);
        Button Reset = findViewById(R.id.Reset);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ed1.setText("");
                Ed2.setText("");
                Ed3.setText("");
                Ed4.setText("");
                t.setText("result");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Ed1.getText().toString());
                int num2 = Integer.parseInt(Ed2.getText().toString());
                int num3 = Integer.parseInt(Ed3.getText().toString());
                int num4 = Integer.parseInt(Ed4.getText().toString());
                t.setText(totalGrade(num1,num2,num3,num4) + " " );
            }
        });
    }

    public static int totalGrade(int num1, int num2, int num3, int num4){


        return num1 + num2 + num3 + num4;
    }
}