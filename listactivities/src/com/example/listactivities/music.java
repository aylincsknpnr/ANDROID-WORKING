package com.example.listactivities;



import java.io.IOException;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.KeyEvent;


public class music extends Activity {

    MediaPlayer  mp;
    Button play,noplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mp=MediaPlayer.create(music.this,R.raw.inna);//ses dosyasını MediaPlayer değişkeniyle ilişkilendiriyoruz.

        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        noplay=(Button)findViewById(R.id.button2);

                if(mp.isPlaying()==false)
                     mp.start();//Ses dosyasını başlatıyoruz.


        noplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(mp.isPlaying()==true)
                    mp.stop();//Ses dosyasını durduruyruz.
            }
        });
    }

  }