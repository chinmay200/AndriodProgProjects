package com.example.spinnermenudropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView greet;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Code to hide the  title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        greet = findViewById(R.id.greet);

        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        Toast.makeText(this, i , Toast.LENGTH_SHORT).show();
        switch (i){

                case 0:
                greet.setText("Apple");
                break;
                case 1:
                greet.setText("Orange");
                break;
                case 2:
                greet.setText("Grape");
                break;
                case 3:
                greet.setText("Banana");
                break;
            default:
                greet.setText("Yolo");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}