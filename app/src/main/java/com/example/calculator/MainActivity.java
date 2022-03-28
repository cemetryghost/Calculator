package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstSummand;
    EditText secondSummand;
    Button addUpTheNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addUpTheNumbers = findViewById(R.id.button);
        firstSummand = findViewById(R.id.editTextNumber1);
        secondSummand = findViewById(R.id.editTextNumber2);

        addUpTheNumbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int first = Integer.parseInt(firstSummand.getText().toString());
                int second = Integer.parseInt(secondSummand.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("first", first);
                intent.putExtra("second", second);
                startActivity(intent);
            }
        });
    }
}
