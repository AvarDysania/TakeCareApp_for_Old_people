package com.example.grands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UsersName extends AppCompatActivity {
    EditText grandname , grandage ;
    Button b1 ;
    public static final String msg="com.example.grands.name";
    public static final String m ="com.example.grands.age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_name);

    }
    public void displaymessage(View view)
    {

        grandname=findViewById(R.id.editTextText3);
        grandage=findViewById(R.id.editTextText4);

        String mess_name = grandname.getText().toString();
        String mess_age =  grandage.getText().toString();
        //int s = Integer.parseInt(mess_age);

        Intent intent = new Intent(this,AnimationLoading.class);
        intent.putExtra(msg,mess_name);
        intent.putExtra(m,mess_age);

        startActivity(intent);


    }

}