package com.example.listactivities;

/**
 * Created by aylin on 14.07.2014.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashekranigorunum);
        Thread t1 = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                    Intent i = new Intent(getBaseContext(), button.class);
                    startActivity(i);
                } catch (InterruptedException e1) {


                } finally {
                    finish();
                }

            }
        };
        t1.start();
    }
}