package com.example.administrator.experiment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2018/5/5 0005.
 */

public class LinearActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        Button bu6 = (Button) findViewById(R.id.button6);
        bu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });
        Button bu7 = (Button) findViewById(R.id.button7);
        bu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        Button bu8 = (Button) findViewById(R.id.button8);
        bu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        Button bu9 = (Button) findViewById(R.id.button9);
        bu9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

