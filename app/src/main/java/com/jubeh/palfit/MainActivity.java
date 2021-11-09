package com.jubeh.palfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image1=findViewById(R.id.image1);
        Thread FirstPage=new Thread(){

            @Override
            public void run() {
                try{
                    sleep (3000);
                    Intent HomeActivity=new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(HomeActivity);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        FirstPage.start();
    }
}