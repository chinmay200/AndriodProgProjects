package com.example.sayhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button hello;
    TextView greet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = this.findViewById(R.id.button);
        greet  =this.findViewById(R.id.hello);

//        hello.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                hello.setText("Hello world");
//            }
//        });
    }
    @SuppressLint("SetTextI18n")
    public void greet(View v){
        greet.setText("Hello world");
    }
}