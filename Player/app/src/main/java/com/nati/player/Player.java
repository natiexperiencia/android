package com.nati.player;

import java.io.IOException;

import android.media.MediaPlayer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import static com.nati.player.R.menu.menu_player;

public class Player extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource("/storage/extSdCard/Media/Barricada/1991 Por Instinto/01 Haz lo que quieras (Tu cuerpo).by AkerrA.mp3");
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(menu_player, menu);
        return true;
    }

}
