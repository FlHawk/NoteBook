package com.swufe.notebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Runnable, AdapterView.OnItemClickListener,AdapterView.OnItemLongClickListener {
    private static final String TAG = "MainActivity";
    ArrayList listItems;
    ListView listView;
    int Position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.mylist);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);

        listView.setEmptyView(findViewById(R.id.nodata));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {
        return false;
    }

    @Override
    public void run() {

    }

    public void add(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,Addone.class);
        startActivity(intent);                                          //打开新的页面
    }
}