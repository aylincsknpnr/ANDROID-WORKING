package com.example.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashekranigorunum);
        Thread t1=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent i =new Intent(getBaseContext(),splashekrani.class);
                    startActivity(i);
                }
                catch(InterruptedException e1){


                }
                finally {
                    finish();
                }

            }
        };
        t1.start();
    }
}
