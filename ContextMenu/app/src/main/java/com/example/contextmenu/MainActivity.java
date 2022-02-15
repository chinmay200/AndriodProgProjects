package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView context;
    TextView fruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = findViewById(R.id.context);
        fruit = findViewById(R.id.fruit);

        registerForContextMenu(context);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.apple:
                Toast.makeText(this, "Apple", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.red));
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.VISIBLE);
                fruit.setText("Apple");
                break;

            case R.id.orange:
                Toast.makeText(this, "Orange", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.orange));
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.VISIBLE);
                fruit.setText("Orange");
                break;

            case R.id.banana:
                Toast.makeText(this, "Banana", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.yello));

                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.bananaimg).setVisibility(View.VISIBLE);
                fruit.setText("Banana");

            case R.id.grape:
                Toast.makeText(this, "Grape", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.green));
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.VISIBLE);
                fruit.setText("Grape");
                break;
        }
        return super.onContextItemSelected(item);
    }
}