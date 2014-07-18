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

    String menus[] = {"BUTTON ÖRNEK","MUSİC","camera"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(MyActivity.this, android.R.layout.simple_list_item_1, menus));
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
            Intent m =new Intent(getBaseContext(),music.class);
            startActivity(m);
        }
        if(position==2){
            Intent n =new Intent(getBaseContext(),camera.class);
            startActivity(n);
        }


    }

}