package com.example.ui_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_string);
        TextView Show=(TextView) findViewById(R.id.Show);
        Intent intent=getIntent();
       // String outputString =intent.getStringExtra("userName" + "芊菱你好~");
        Show.setText(intent.getStringExtra("userName")+"早安");
    }

}