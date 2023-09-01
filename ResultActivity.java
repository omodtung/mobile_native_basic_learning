package com.example.lifeofactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult =(TextView) findViewById(R.id.tvKetQua);
        Intent intent =this.getIntent();
        int a  =  intent.getIntExtra("NUMBERA", 0);
        int b = intent.getIntExtra("NUMBERB" ,0);
        int rs  =  intent.getIntExtra("RESULT", 0);
        tvResult.setText(a+"+"+b+"="+rs);

    }
}