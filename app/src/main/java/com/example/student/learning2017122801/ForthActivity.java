package com.example.student.learning2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ForthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
    }

    public void click1(View v)
    {
        Intent in=new Intent();
        EditText et=findViewById(R.id.editText);
        in.putExtra("myresult",et.getText().toString());
        setResult(RESULT_OK,in);
        finish();
    }

    public void click2(View v)
    {
        finish();
    }
}
