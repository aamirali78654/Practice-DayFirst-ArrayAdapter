package com.example.MainActivityFour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.practice_dayfirst_arrayadapter.R;
import java.util.ArrayList;


public class MyAdapterFour extends ArrayAdapter<Animals>
{
    ArrayList<Animals> animals_list;
    LayoutInflater lf;

    public MyAdapterFour( Context context, int resource, ArrayList<Animals> objects) {
        super(context, resource, objects);
        animals_list = objects;
        lf = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return animals_list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = lf.inflate(R.layout.ui_xml_four, null);

        TextView text_four = v.findViewById(R.id.text_four);
        ImageView image_four = v.findViewById(R.id.image_four);

        text_four.setText(animals_list.get(position).getarr_lt());
        image_four.setImageResource(animals_list.get(position).getimagefour());

        return v;
    }
}
