package com.example.administrator.experiment2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;



public class FrameActivity extends AppCompatActivity {
    int[]imageIds = new int[]{
            R.drawable.picture1,
            R.drawable.picture2,
            R.drawable.picture3,
            R.drawable.picture4,
            R.drawable.picture5
    };

    private Message handler;
    int currentImageId = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        Button bn14 = (Button) findViewById(R.id.button14);
        bn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrameActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        final ImageView show1 = (ImageView) findViewById(R.id.picture1);
        final ImageView show2 = (ImageView) findViewById(R.id.picture2);
        final ImageView show3 = (ImageView) findViewById(R.id.picture3);
        final ImageView show4 = (ImageView) findViewById(R.id.picture4);
        final ImageView show5 = (ImageView) findViewById(R.id.picture5);
        Message msg=handler.obtain();
        final Handler myHandler = new Handler(){
            public void handleMessage(Message msg) {
                if (msg.what == 0x1233){
                    show1.setImageResource(imageIds[currentImageId++%imageIds.length]);
                }
                super.handleMessage(msg);
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                myHandler.sendEmptyMessage(0x1233);
            }
        },0,1200);
    }

}
