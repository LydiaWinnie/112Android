package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Output;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void buttom_Click(View view) {
        int counter;
        TextView value = findViewById(R.id.textView);
        counter = Integer.parseInt(value.getText().toString());
        counter++;
        value.setText(Integer.toString(counter));
    }

    public void zero_Click(View view) {
        TextView value = findViewById(R.id.textView);
        value.setText("0");


    }

}
