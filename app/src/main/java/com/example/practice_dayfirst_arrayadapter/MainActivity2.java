package com.example.practice_dayfirst_arrayadapter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Spinner spinner_id;
    String[] name = {"Aamir","Raza","Farhan","ALI","Zia","AZAM","Aamir","Raza","Farhan","ALI","Zia","AZAM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        spinner_id = findViewById(R.id.spinnerid);

        spinner_id.setOnItemClickListener(new AdapterView.OnItemClickListener()  {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity2.this, "Name : "+name[i], Toast.LENGTH_SHORT).show();
            }
        });

        ArrayAdapter<String> arr_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,name);
        spinner_id.setAdapter(arr_adapter);

    }
}