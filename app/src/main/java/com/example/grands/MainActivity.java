package com.example.grands;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//com.example.grands.R --> R library for storing all id's;
public class MainActivity extends AppCompatActivity {

    //Declaration of References
    Button fine , help ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fine=findViewById(R.id.button);
        help=findViewById(R.id.button);

    }
    public void useractivity(View view)
    {


        Intent intent = new Intent(this,UsersName.class);

        startActivity(intent);
    }
    public void patient_help(View view)
    {
        Intent intent = new Intent(this,PatientHelp.class);
        startActivity(intent);
    }
}