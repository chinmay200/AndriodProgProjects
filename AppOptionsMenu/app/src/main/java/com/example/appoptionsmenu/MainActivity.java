package com.example.appoptionsmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView fruit;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruit = findViewById(R.id.fruit);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.grape:
                Toast.makeText(this, "Grape", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.green));

                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.VISIBLE);
                fruit.setText("Grape");
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
            case R.id.apple:
                Toast.makeText(this, "Apple", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.red));

                findViewById(R.id.bananaimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.VISIBLE);
                fruit.setText("Apple");
                break;
            case R.id.banana:
                Toast.makeText(this, "Banana", Toast.LENGTH_SHORT).show();
                findViewById(R.id.screen).setBackgroundColor(getResources().getColor(R.color.yello));

                findViewById(R.id.grapeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.orangeimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.appleimg).setVisibility(View.INVISIBLE);
                findViewById(R.id.bananaimg).setVisibility(View.VISIBLE);
                fruit.setText("Banana");
                break;
        }
        return true;
    }
}


//package com.example.myapoptionsmenu;
//
//        import androidx.annotation.NonNull;
//        import androidx.appcompat.app.AppCompatActivity;
//        import androidx.appcompat.view.menu.ActionMenuItem;
//        import androidx.core.content.ContextCompat;
//
//        import android.os.Bundle;
//        import android.view.Menu;
//        import android.view.MenuInflater;
//        import android.view.MenuItem;
//        import android.widget.Toast;
//
//        import java.util.zip.Inflater;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
////        super.onCreateOptionsMenu(menu);
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu,menu);
//        menu.add("Coffee");
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
////        String text = item.getTitle().toString();
////        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
//        switch(item.getTitle().toString()){
//            case "Red":
//                findViewById(R.id.clr).setBackgroundColor(getResources().getColor(R.color.black));
//                break;
//            case "Green":
//                findViewById(R.id.clr).setBackgroundColor(getResources().getColor(R.color.green));
//                break;
//            case "Blue":
//                findViewById(R.id.clr).setBackgroundColor(getResources().getColor(R.color.blue));
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}