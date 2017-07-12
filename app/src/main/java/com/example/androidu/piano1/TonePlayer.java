package com.example.androidu.piano1;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.util.Log;

/**
 * Created by wilbert on 6/30/17.
 */

public class TonePlayer {
    Thread mThread = null;
    int mSamplesPerSecond = 44100;
    int mVolume = 200;
    int mFrequency = 60;
    boolean mIsPlaying = false;

    public TonePlayer(){

    }

    public boolean isPlaying(){
        return mIsPlaying;
    }

    public void setFrequency(int frequency){
        mFrequency = frequency;
    }

    public void setVolume(int volume){
        mVolume = volume;
    }

    public void start(){
        mThread = new Thread(){
            public void run(){
                int bufferSize = AudioTrack.getMinBufferSize(mSamplesPerSecond, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
                AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC, mSamplesPerSecond, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT, bufferSize, AudioTrack.MODE_STREAM);
                audioTrack.play();

                short[] samples = new short[bufferSize];
                mIsPlaying = true;
                int j = 0;



                while(mIsPlaying){

                    Log.d("TonePlayer", "j: " + j);
                    // fill in samples with sample data
                    for(int i = 0; i < bufferSize; i++){
                        samples[i] = (short) (mVolume * Math.sin((double) j / mSamplesPerSecond * mFrequency * 2 * Math.PI));
                        j++;
                    }

                    Log.d("TonePlayer", "samples: " + samples[0] + ", " + samples[1] + "  ...  " + samples[bufferSize - 2] + ", " + samples[bufferSize - 1]);

                    audioTrack.write(samples, 0, bufferSize);

                }

                audioTrack.stop();
                audioTrack.release();
            }
        };

        mThread.start();
    }

    public void stop(){
        mIsPlaying = false;
//        try {
//            mThread.join();
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
        mThread = null;
    }
}
