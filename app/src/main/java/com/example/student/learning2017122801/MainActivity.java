package com.example.student.learning2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv;
    TextView tv2;
    final int request_page_3=123; //設置一個code name 讓後續程式員方便解讀
    final int request_page_4=456;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        tv2=findViewById(R.id.textview2);
    }

    public void click1(View v)
    {
        tv.setText("test");
    }

    public  void click2(View v)
    {
        EditText ed=findViewById(R.id.edittext);
        Intent in=new Intent(MainActivity.this,SecActivity.class);
        in.putExtra("data",ed.getText().toString());
        startActivity(in);

    }

    public void click3(View v)
    {
        Intent in=new Intent(MainActivity.this,ThirdActivity.class);
        startActivityForResult(in,request_page_3);
    }

    public void click4(View v)
    {
        Intent in=new Intent(MainActivity.this,ForthActivity.class);
        startActivityForResult(in,request_page_4);//requestcode 對應碼
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == request_page_3)
        {
            if(resultCode == RESULT_OK)
            {
                tv.setText(data.getStringExtra("myresult"));
            }
        }

        if(requestCode == request_page_4)
        {
            if(resultCode == RESULT_OK)
            {
                tv2.setText(data.getStringExtra("myresult"));
            }
        }



    }//onActivityResult  這個方法跟Function設置之後，用任何方法回來此頁面都一定會抓Data
}
