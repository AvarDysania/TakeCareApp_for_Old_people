package com.example.grands;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;
import android.view.View;

public class AnimationLoading extends AppCompatActivity {

    LottieAnimationView l1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_loading);

        l1 = findViewById(R.id.loading);
        l1.playAnimation();

        //retrieving data
        Intent intn = getIntent();
        String x1 = intn.getStringExtra(UsersName.msg);
        String x2 = intn.getStringExtra(UsersName.m);

        Intent intent = new Intent(this,MainInterfaceofuser.class);
        intent.putExtra(UsersName.msg,x1);
        intent.putExtra(UsersName.m,x2);
        l1.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        },8000);


    }



}