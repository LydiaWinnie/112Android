package com.example.a20240418;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.metrics.Event;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements  View.OnTouchListener{
    private TextView txvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvOutput = (TextView) findViewById(R.id.txvOutput);
        txvOutput.setTextSize(25);
        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.activity_main);
        layout.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int act = motionEvent.getAction();
        switch (act) {
            case MotionEvent.ACTION_DOWN:
                txvOutput.setText("ACTION_DOWN");
                txvOutput.setTextColor(Color.RED);
                break;
            case MotionEvent.ACTION_UP:
                txvOutput.setText("ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                txvOutput.setText("ACTION_MOVE");
                float x= motionEvent.getX();
                float y=motionEvent.getY();
                txvOutput.setText("X="+x+"\nY="+y
                );
                break;
        }
        return true;
    }
}