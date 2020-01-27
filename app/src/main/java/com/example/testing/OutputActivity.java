package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class OutputActivity extends AppCompatActivity {
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        tvOutput = findViewById(R.id.tvOutput);

        Bundle bundle = getIntent().getExtras();
        if ( !bundle.isEmpty()){
            float str = bundle.getFloat("result");
            tvOutput.setText(Float.toString(str));
        }
        else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }
}
