package com.example.practice_dayfirst_arrayadapter;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String[] name = {"Aamir","Raza","Farhan","ALI","Zia","AZAM","Aamir","Raza","Farhan","ALI","Zia","AZAM"};
    ListView list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list_view = (ListView) findViewById(R.id.list_view);

        ArrayAdapter<String> arr_adapter = new ArrayAdapter<String>(this,R.layout.ui_text_view,R.id.text_id1,name);
        list_view.setAdapter(arr_adapter);


    }
}