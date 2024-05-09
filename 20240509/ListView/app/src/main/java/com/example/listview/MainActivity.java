package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lv;

    private String[] cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adpcitie= new ArrayAdapter<>(this,
                android.R.layout.select_dialog_singlechoice,cities);

        cities = getResources().getStringArray(R.array.cities);
        lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(adpcitie);
        lv.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onClick(View v) {
            String cities=lv.getSelectedItem().toString();
            TextView output = (TextView) findViewById(R.id.lblOutput);
            output.setText("你是住在" + cities);
            }
        });
    }
}
