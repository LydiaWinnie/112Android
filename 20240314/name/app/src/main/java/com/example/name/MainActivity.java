package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void button_click(View view){
    EditText edtTamp=(EditText)  findViewById(R.id.editTextText);
    TextView txvShow=(TextView)  findViewById(R.id.textView);

    double degreeC=Double.parseDouble(edtTamp.getText().toString());
    double degreeF=(9.0*degreeC)/5.0+32.0;
    txvShow.setText("華氏溫度:"+degreeF);
}

}
