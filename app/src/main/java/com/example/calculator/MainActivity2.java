package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        answer = findViewById(R.id.textViewAnswer);

        int first = getIntent().getExtras().getInt("first");
        int second = getIntent().getExtras().getInt("second");
        int answer2 = first + second;
        if(second < 0){
            answer.setText((first) + " + " + "(" + (second) + ")" + " = " + (answer2));

        }
        else{
            answer.setText((first) + " + " + (second) + " = " + (answer2));
        }
    }
}