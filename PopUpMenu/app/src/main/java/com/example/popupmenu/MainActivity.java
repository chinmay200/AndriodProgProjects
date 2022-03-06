package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    TextView fruit;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruit = findViewById(R.id.fruit);
        img = findViewById(R.id.image);
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
                img.setImageResource(R.drawable.apple);

                fruit.setText("Apple");
                break;
            case R.id.orange:
                Toast.makeText(this, "Orange", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.orange));
                img.setImageResource(R.drawable.orange);
                fruit.setText("Orange");
                break;
            case R.id.grape:
                Toast.makeText(this, "Grape", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.green));
                img.setImageResource(R.drawable.grape);
                fruit.setText("Grape");
                break;
            case R.id.banana:
                Toast.makeText(this, "Banana", Toast.LENGTH_SHORT).show();

                findViewById(R.id.dis).setBackgroundColor(getResources().getColor(R.color.yellow));
                img.setImageResource(R.drawable.banana);
                fruit.setText("Banana");
                break;
        }
        return false;
    }
}