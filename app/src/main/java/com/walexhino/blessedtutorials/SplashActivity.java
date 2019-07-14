package com.walexhino.blessedtutorials;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);




        //handles splash Actions

        Thread splash=new Thread(){

            public void run(){

                try{

                sleep(6000);

                    Intent i = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (Exception e){

                }

            }

        };

        splash.start();
    }

}