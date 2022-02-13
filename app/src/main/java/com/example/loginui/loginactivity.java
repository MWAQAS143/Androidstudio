package com.example.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginactivity<edittext, button> extends AppCompatActivity {

    TextView b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        b=findViewById(R.id.signup);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent P= new Intent ( packageContext:loginactivity.this,signupactivity.class);
                startActivity(P);
            }
        });

        TextView c;
        c=findViewById(R.id.aboutus);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent A=new Intent(packagecontext: loginactivity.this,aboutus.class);
                startActivity(A);
            }
        });





    }
}