package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etfirst, etSecond;
    private Button btnSub, btnSum, btnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirst = findViewById(R.id.etfirst);
        etSecond = findViewById(R.id.etSecond);
        btnSub = findViewById(R.id.btnSub);
        btnSum = findViewById(R.id.btnSum);
        btnDivide = findViewById(R.id.btnDivide);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Add();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sub();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divide();
            }
        });

    }

    private void Add(){
        float first = Float.parseFloat(etfirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.add(first, second);

        Intent intent = new Intent(MainActivity.this, OutputActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    private void Sub(){
        float first = Float.parseFloat(etfirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.subtract(first, second);

        Intent intent = new Intent(MainActivity.this, OutputActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    private void divide(){
        float first = Float.parseFloat(etfirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());
        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.divide(first, second);

        Intent intent = new Intent(MainActivity.this, OutputActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
