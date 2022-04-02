package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstSummand;
    EditText secondSummand;
    Button addUpTheNumbers;
    Intent intent;
    String error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addUpTheNumbers = findViewById(R.id.button);
        firstSummand = findViewById(R.id.editTextFirstSummand);
        secondSummand = findViewById(R.id.editTextSecondSummand);
    }

    public void onClick(View view) {
        try {
            int first = Integer.parseInt(firstSummand.getText().toString());
            int second = Integer.parseInt(secondSummand.getText().toString());
            intent = new Intent(this, MainActivity2.class);
            intent.putExtra("first", first);
            intent.putExtra("second", second);
            startActivity(intent);
        }
        catch (Exception ex){
            error = getString(R.string.invalidDataEntry);
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }
}
