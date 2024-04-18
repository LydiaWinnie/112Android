package com.example.radiobtn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String outoStr="";

                RadioButton boy=(RadioButton) findViewById(R.id.rdbBoy);
                RadioButton girl=(RadioButton) findViewById(R.id.rdbGirl);
                if(boy.isChecked())
                    outoStr+="男生\n";
                else if (girl.isChecked()) {
                    outoStr+="女生\n";
                RadioGroup type=(RadioGroup) findViewById(R.id.rgType) ;
             /*   switch (type.getCheckedRadioButtonId()){
                    case R.id.rdbAdult:
                        outoStr+="全票\n";
                        break;
                    case R.id.rdbChild:
                        outoStr+="兒童票\n";
                        break;
                    case R.id.rdbStudent:
                        outoStr+="學生票\n";
                        break;
                }*/
                    if(type.getCheckedRadioButtonId()==R.id.rdbAdult)
                        outoStr +="全票\n";
                    else if(type.getCheckedRadioButtonId()==R.id.rdbStudent)
                        outoStr +="學生票\n";
                    else
                        outoStr +="兒童票\n";
                    TextView output=(TextView) findViewById(R.id.lblOutput);
                output.setText(outoStr);
                }

            }
        });
    }
}