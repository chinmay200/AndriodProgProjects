package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class user extends AppCompatActivity {

    TextView userText;
    TextView passText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        userText = findViewById(R.id.user);
        passText = findViewById(R.id.pass);

        Intent in = getIntent();

        userText.setText(in.getStringExtra("User"));
        passText.setText(in.getStringExtra("Password"));
    }
}