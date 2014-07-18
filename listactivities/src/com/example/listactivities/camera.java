package com.example.listactivities;

/**
 * Created by aylin on 18.07.2014.
 */


import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class camera extends Activity implements OnClickListener {
    Button b;
    ImageView img;
    ImageButton imb;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);
        img = (ImageView) findViewById(R.id.snapshotImageView);
        imb=(ImageButton)findViewById(R.id.imageButton);
        b = (Button) findViewById(R.id.cameraButton);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent in = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(in, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            Bitmap image = (Bitmap) data.getExtras().get("data");
            img.setImageBitmap(image);
        } else if (resultCode == RESULT_CANCELED) {
            Toast.makeText(getApplicationContext(),
                    "error occured during opening camera", Toast.LENGTH_SHORT)
                    .show();
        }
    }
    public void setwallpaper(View view) {
        img.buildDrawingCache();
        Bitmap bmap = img.getDrawingCache();
        WallpaperManager m=WallpaperManager.getInstance(this);

        try {
            m.setBitmap(bmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
