package com.vietle.vietnamesetranslations;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    public void buttonClicked (View view){
        int id = view.getId();
        String ourId= "";
        ourId = view.getResources().getResourceEntryName(id);
        int resourceID = getResources().getIdentifier(ourId, "raw", "com.vietle.vietnamesetranslations");
            MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceID);
            mediaPlayer.start();

        Log.i("Button Tapped", ourId );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
