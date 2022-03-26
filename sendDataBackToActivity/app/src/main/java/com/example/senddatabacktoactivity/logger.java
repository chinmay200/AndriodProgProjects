package com.example.senddatabacktoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Logger;

public class logger extends AppCompatActivity {

    EditText username;
    EditText password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logger);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.log);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().length() == 0){
                    Toast.makeText(logger.this, "Username cannot be empty", Toast.LENGTH_SHORT).show();
                }
                if(password.getText().toString().length() == 0){
                    Toast.makeText(logger.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent in = new Intent(logger.this , com.example.senddatabacktoactivity.MainActivity.class);
                    in.putExtra("username" , username.getText().toString());
                    in.putExtra("password" , password.getText().toString());
                    
                }
            }
        });

    }
}