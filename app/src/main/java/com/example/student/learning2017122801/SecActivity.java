package com.example.student.learning2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        TextView tv=findViewById(R.id.textView3);
        Intent in=getIntent();
        String str=in.getStringExtra("data");
        tv.setText(str);
    }

    public void click1(View v)
    {
        Intent in2=new Intent(SecActivity.this,MainActivity.class);
        startActivity(in2);
    }
}
