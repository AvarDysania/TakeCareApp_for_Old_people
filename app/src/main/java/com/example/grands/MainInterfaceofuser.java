package com.example.grands;

//import static com.example.grands.UsersName.m;
import static com.example.grands.UsersName.m;
import static com.example.grands.UsersName.msg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import android.view.View;

public class MainInterfaceofuser extends AppCompatActivity {
    TextView t1 , t2 ;
    LottieAnimationView l1;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interfaceofuser);

        Intent intent = getIntent();
        String name = intent.getStringExtra(msg);
        String age  = intent.getStringExtra(m);

       t1=findViewById(R.id.textView7);
       t2=findViewById(R.id.textView9);

       t1.setText(name);
       t2.setText(age);


    }
    public void medication(View view)
    {
        Intent intent = new Intent(this,MedicationForGrands.class);
        startActivity(intent);
    }
    public void healthCheck(View view)
    {
        Intent intent2 = new Intent(this,healthCheck.class);
        startActivity(intent2);
    }
}