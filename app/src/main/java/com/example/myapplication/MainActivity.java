package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    final String[] book = {"Computer Architecture", "Algorithm","Artificial", "Graphics", "Data Structrue", "Data Base", "Network", "Operating", "Mobile" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(" List View Example");
        ListView mylistview = (ListView) findViewById(R.id.listview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,book);
        mylistview.setAdapter(adapter);
    }
}