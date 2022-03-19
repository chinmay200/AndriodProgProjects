package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this , com.example.intents.user.class);
                String user;
                String pass;

                user = username.getText().toString();
                pass = password.getText().toString();

                in.putExtra("User" , user);
                in.putExtra("Password" , pass);

                startActivity(in);
            }
        });
    }
}