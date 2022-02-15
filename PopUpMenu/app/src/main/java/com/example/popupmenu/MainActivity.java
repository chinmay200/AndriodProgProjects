package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    TextView fruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruit = findViewById(R.id.fruit);
    }
    
    public void popupmenu(View v){
//        Toast.makeText(this, "Add your favorite fruits", Toast.LENGTH_SHORT).show();
        PopupMenu popupMenu = new PopupMenu(this , v);
        popupMenu.inflate(R.menu.menu);
        popupMenu.setOnMenuItemClickListener(this);

        popupMenu.show();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.apple:
                Toast.makeText(this, "Apple", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.red));
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.VISIBLE);

                fruit.setText("Apple");
                break;
            case R.id.orange:
                Toast.makeText(this, "Orange", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.orange));
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.VISIBLE);
                fruit.setText("Orange");
                break;
            case R.id.grape:
                Toast.makeText(this, "Grape", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.green));
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.VISIBLE);
                fruit.setText("Grape");
                break;
            case R.id.banana:
                Toast.makeText(this, "Banana", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.yellow));
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.bananaimg).setVisibility(View.VISIBLE);
                fruit.setText("Banana");
                break;
        }
        return false;
    }
}