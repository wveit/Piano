package com.example.androidu.piano1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cKey;
    Button dKey;
    Button eKey;
    Button fKey;
    Button gKey;
    Button aKey;
    Button bKey;
    Button highCKey;

    TonePlayer cTonePlayer = new TonePlayer();
    TonePlayer dTonePlayer = new TonePlayer();
    TonePlayer eTonePlayer = new TonePlayer();
    TonePlayer fTonePlayer = new TonePlayer();
    TonePlayer gTonePlayer = new TonePlayer();
    TonePlayer aTonePlayer = new TonePlayer();
    TonePlayer bTonePlayer = new TonePlayer();
    TonePlayer highCTonePlayer = new TonePlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int volume = 16000;

        cTonePlayer.setFrequency(262);
        cTonePlayer.setVolume(volume);

        dTonePlayer.setFrequency(294);
        dTonePlayer.setVolume(volume);

        eTonePlayer.setFrequency(330);
        eTonePlayer.setVolume(volume);

        fTonePlayer.setFrequency(349);
        fTonePlayer.setVolume(volume);

        gTonePlayer.setFrequency(392);
        gTonePlayer.setVolume(volume);

        aTonePlayer.setFrequency(440);
        aTonePlayer.setVolume(volume);

        bTonePlayer.setFrequency(494);
        bTonePlayer.setVolume(volume);

        highCTonePlayer.setFrequency(523);
        highCTonePlayer.setVolume(volume);


        cKey = (Button)findViewById(R.id.btn_c_key);
        dKey = (Button)findViewById(R.id.btn_d_key);
        eKey = (Button)findViewById(R.id.btn_e_key);
        fKey = (Button)findViewById(R.id.btn_f_key);
        gKey = (Button)findViewById(R.id.btn_g_key);
        aKey = (Button)findViewById(R.id.btn_a_key);
        bKey = (Button)findViewById(R.id.btn_b_key);
        highCKey = (Button)findViewById(R.id.btn_high_c_key);

        cKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    cTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    cTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        dKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    dTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    dTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        eKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    eTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    eTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        fKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    fTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    fTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        gKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    gTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    gTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        aKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    aTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    aTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        bKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    bTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    bTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });

        highCKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_UP){
                    highCTonePlayer.stop();
                    Log.d("MainActivity", "Released");
                }
                else if(event.getAction() == MotionEvent.ACTION_DOWN){
                    highCTonePlayer.start();
                    Log.d("MainActivity", "Pressed");
                }
                return false;
            }
        });
    }
}
