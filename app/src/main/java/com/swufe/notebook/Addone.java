package com.swufe.notebook;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Addone extends AppCompatActivity {
    private static final String TAG ="Addone" ;
    String date;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addone);
    }

    public void clear(View view) {
        TextView tv = findViewById(R.id.editTextTextPersonName);//获取文本框的ID
        tv.setText("");                                         //设置文本框内容为空白
    }

    public void save(View view) {
        TextView tv = findViewById(R.id.editTextTextPersonName);

        sp = getSharedPreferences("myrate", Activity.MODE_PRIVATE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        date = sdf.format(now);



    }
}