package com.example.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.nio.InvalidMarkException;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable batAnimation;
    private ImageView bat1ImageView;
    private ImageView skateImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bat1ImageView = (ImageView) findViewById(R.id.batImage1_ID);
        bat1ImageView.setBackgroundResource(R.drawable.skate_animation);
        batAnimation = (AnimationDrawable) bat1ImageView.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        batAnimation.start();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

//                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein_animation);
//                bat1ImageView.startAnimation(animation);
                //Stop Animation
                batAnimation.stop();
            }
        }, 22000); // 5 Seconds

        return super.onTouchEvent(event);
    }
}
