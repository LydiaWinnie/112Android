package com.example.ch5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {
private double original_size=10;
private TextView txvOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((R.layout.activity_main));
        TextView txvOutput = (TextView) findViewById(R.id.txvOutput);
        txvOutput.setTextSize(original_size);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
        btn.setOnLongClickListener(this);


    }
    @Override
    public void onClick (View v){
        float size =txvOutput.getTextSize();
        Log.v("SIZE","size"+size);
        txvOutput.setTextSize(size+1);

    }

    @Override
    public boolean onLongClick (View v){
        txvOutput.setTextSize((float) original_size);
        return false;

    }
}