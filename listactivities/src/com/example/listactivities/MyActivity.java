package com.example.listactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyActivity extends ListActivity {

    String sehirler[] = {"page1","page2","page3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(MyActivity.this, android.R.layout.simple_list_item_1, sehirler));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);

        if(position==0){
            Intent i =new Intent(getBaseContext(),Splash.class);
            startActivity(i);
        }
        if(position==1){
            Toast.makeText(getApplicationContext(), "tamam", Toast.LENGTH_SHORT).show();
        }
        if(position==2){
            Toast.makeText(getApplicationContext(), "tamam", Toast.LENGTH_SHORT).show();
        }


    }

}