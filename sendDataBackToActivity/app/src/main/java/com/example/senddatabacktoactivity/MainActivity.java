package com.example.senddatabacktoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView loginStatus;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.logger);
        loginStatus = findViewById(R.id.loginstatus);
        username = findViewById(R.id.user);

        Intent res = getIntent();
        String user = res.getStringExtra("username");
        String pass = res.getStringExtra("password");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this , com.example.senddatabacktoactivity.logger.class);
                startActivity(in);
            }
        });

    }
}