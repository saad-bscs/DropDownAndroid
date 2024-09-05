package com.example.spinnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class DropDownActivity extends AppCompatActivity {

    String[] item = {"Material", "Design", "Components", "Android", "5.0 Lollipop"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);

        autoCompleteTextView = findViewById(R.id.auto_complete_textview);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_items, item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item = adapterView.getItemAtPosition(position).toString();
                Log.e("Item: ", "" + item);
            }
        });
    }
}