package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class user extends AppCompatActivity {

    TextView userText;
    TextView passText;
    Button launch;
    Button call;
    Button find;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        userText = findViewById(R.id.user);
        passText = findViewById(R.id.pass);
        launch = findViewById(R.id.webpage);
        call = findViewById(R.id.phonecall);
        find = findViewById(R.id.map);


        Intent in = getIntent();

        userText.setText(in.getStringExtra("User"));
        passText.setText(in.getStringExtra("Password"));

        launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.instagram.com/"));
                startActivity(search);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:+919968264401"));
                startActivity(call);
            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent look = new Intent(Intent.ACTION_VIEW , Uri.parse("geo:28.7041 , 77.1025"));
                startActivity(look);
            }
        });
    }
}