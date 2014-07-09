package com.example.ButtonOrnek;

import android.app.Activity ;
import android.content.Intent ;
import android.net.Uri ;
import android.os.Bundle ;
import android.widget.Button ;
import android.view.View ;
import android.view.View.OnClickListener ;
import android.widget.TextView;


public class MyActivity extends Activity {
    Button button;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


    }

    public void tikla(View view) {

        final TextView sonuc=(TextView)findViewById(R.id.bas);
        sonuc.setText(getString(R.string.dugme));
    }
}



