package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private TextView Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button OK=(Button)findViewById(R.id.OK);
        Button C=(Button)findViewById(R.id.C);
        C.setOnClickListener(this);
        OK.setOnClickListener(this);
        Show=(TextView)findViewById(R.id.Show);
        Show.setTextSize(36);

    }


    @Override
    public void onClick(View v) {
        EditText h, w;
        h = (EditText)findViewById(R.id.h);
        w = (EditText)findViewById(R.id.w);

        if(v.getId()==R.id.OK){
          double h1=Double.parseDouble(h.getText().toString());
          double w1=Double.parseDouble(w.getText().toString());
          double bmi=w1/Math.pow(h1/100.0,2);
          if(bmi>=24)
              Show.setTextColor(Color.RED);
          else if(bmi<18.5)
              Show.setTextColor(Color.BLUE);
          else
              Show.setTextColor(Color.GREEN);

          Show.setText(String.format("%.2f",bmi));
        }
        else{
            h.setText("0");
            w.setText("0");
            Show.setText(" ");



        }
    }
}

