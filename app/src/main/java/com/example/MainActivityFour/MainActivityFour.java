package com.example.MainActivityFour;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ListView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.practice_dayfirst_arrayadapter.databinding.ActivityMainFourBinding;

import com.example.practice_dayfirst_arrayadapter.R;

import java.util.ArrayList;

public class MainActivityFour extends AppCompatActivity {
    ArrayList arr_list =new ArrayList();
    ListView listview_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_main_four);
            listview_four = findViewById(R.id.listview_four);

        //----------------blew in custom arraylist------------------

            arr_list.add(new Animals(R.drawable.cat, "pixels"));
            arr_list.add(new Animals(R.drawable.catc, "catc"));
            arr_list.add(new Animals(R.drawable.dogs, "dogs"));
            arr_list.add(new Animals(R.drawable.dolphin, "dolphin"));
            arr_list.add(new Animals(R.drawable.ducklens, "ducklens"));
            arr_list.add(new Animals(R.drawable.photo, "photo"));
            arr_list.add(new Animals(R.drawable.tabbycat, "tabbycat"));
            arr_list.add(new Animals(R.drawable.hedgehog, "hedgehog"));
            arr_list.add(new Animals(R.drawable.cat, "pixels"));
            arr_list.add(new Animals(R.drawable.catc, "catc"));
            arr_list.add(new Animals(R.drawable.dogs, "dogs"));
            arr_list.add(new Animals(R.drawable.dolphin, "dolphin"));
            arr_list.add(new Animals(R.drawable.ducklens, "ducklens"));
            arr_list.add(new Animals(R.drawable.photo, "photo"));
            arr_list.add(new Animals(R.drawable.tabbycat, "tabbycat"));
            arr_list.add(new Animals(R.drawable.hedgehog, "hedgehog"));
        //--------------------------------------------------------------------->
        MyAdapterFour myadapter = new MyAdapterFour(this,R.layout.ui_xml_four,arr_list);
        listview_four.setAdapter(myadapter);
    }
}
