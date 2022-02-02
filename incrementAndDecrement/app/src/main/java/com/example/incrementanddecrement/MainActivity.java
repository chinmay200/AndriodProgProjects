package com.example.incrementanddecrement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button inc;
    Button dec;
    Button reset;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inc = findViewById(R.id.button);
        dec = findViewById(R.id.button2);
        reset = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);
//        inc.setOnClickListener(new View.OnClickListener() {
////            String.valueOf()
//            @Override
//            public void onClick(View view) {
//                textView.setText("hello");
//            }
//        });
    }

//    public void inc(View v){
//        num++;
//        textView.setText(String.valueOf(num));
//    }
//    public void dec(View v){
//        num--;
//        textView.setText(String.valueOf(num));
//    }
//    public void reset(View v){
//        num = 0;
//        textView.setText(String.valueOf(num));
//    }
    public void numbermanip(View v){
        int id = v.getId();
        if(id == inc.getId()){
            num++;
            textView.setText(String.valueOf(num));
        }
        else if(id == dec.getId()){
            num--;
            textView.setText(String.valueOf(num));
        }
        else{
            num = 0;
            textView.setText(String.valueOf(num));
        }
    }
}