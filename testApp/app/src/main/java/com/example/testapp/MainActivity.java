package com.example.testapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView greet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greet = this.findViewById(R.id.greet);
        Spannable spannable = new SpannableString(greet.getText()+"Bros");
        spannable.setSpan(new ForegroundColorSpan(Color.RED), 0, greet.getText().length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(new ForegroundColorSpan(Color.GREEN), greet.getText().length(), greet.getText().length()+4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        greet.setText( spannable );
    }
}