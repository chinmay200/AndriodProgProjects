package com.example.sqliteprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.sqliteprac.Modal.Toy;
import com.example.sqliteprac.data.MyDbHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db = new MyDbHandler(MainActivity.this);

        //Object data creation
        Toy toy = new Toy();
        toy.setToy("Football");
        toy.setType("Soft and safe for kids");

        //Adding data in database
        db.addToy(toy);

        Toy  toy1 = new Toy();
        toy1.setToy("Car and bike");
        toy1.setType("Hard and safe for kids");

        db.addToy(toy1);
        Toy toy2 = new Toy();
        toy2.setToy("Kitchen set");
        toy2.setType("hard and safe for kids");

        db.addToy(toy2);

        Log.d("Check" , Integer.toString(toy.getId()) + Integer.toString(toy1.getId()) + Integer.toString(toy2.getId()));

    }
}