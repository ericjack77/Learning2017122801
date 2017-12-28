package com.example.student.learning2017122804;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Uri uri=Uri.parse("http://tw.yahoo.com");
        Intent in=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }

    public void click2(View v)
    {
        Uri uri=Uri.parse("geo:0,0?q=綠島");
        Intent in=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(in);
    }

    public void click3(View v)
    {
        Uri uri=Uri.parse("tel:0977165804");
        Intent in=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(in);
    }
}
