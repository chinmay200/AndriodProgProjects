package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    TextView convert;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.increment);
        textView = findViewById(R.id.textView);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Conversion sucessfull", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = kg*2.205;
//                textView.setText("The corresponding value of kg : " + kg + " in pound is :  " + pound);
//            }
//        });
    }
    public void increment(View view){
        num++;
        textView.setText(num);
    }

    public void decrement(View view){
        num--;
        textView.setText(num);
    }

    public void reset(View view){
        num = 0;
        textView.setText(num);
    }
}
