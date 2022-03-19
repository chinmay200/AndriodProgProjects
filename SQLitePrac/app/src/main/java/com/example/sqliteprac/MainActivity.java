package com.example.sqliteprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sqliteprac.Modal.Toy;
import com.example.sqliteprac.data.MyDbHandler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler db = new MyDbHandler(MainActivity.this);

        //Object data creation
//        Toy toy = new Toy();
//        toy.setToy("Football");
//        toy.setType("Soft and safe for kids");
//
//        //Adding data in database
//        db.addToy(toy);
//
//        Toy  toy1 = new Toy();
//        toy1.setToy("Car and bike");
//        toy1.setType("Hard and safe for kids");
//
//        db.addToy(toy1);
//        Toy toy2 = new Toy();
//        toy2.setToy("Kitchen set");
//        toy2.setType("hard and safe for kids");
//
//        db.addToy(toy2);

//        Log.d("Check" , Integer.toString(toy.getId()) + Integer.toString(toy1.getId()) + Integer.toString(toy2.getId()));

        //Retrieving all toys
        ArrayList<Toy> allToys = db.getToys();
        for (Toy t : allToys) {
            Log.d("AllToys" , t.getType() + " " + t.getToy()  + " " + Integer.toString(t.getId()));
        }


        //Updating toy
//        toy2.setId(25);
//        int row = db.updateToy(toy2);
//
//        //Delete a toy
//        toy2.setId(18);
//        db.deleteToy(toy2);

        //Count number of toys
        Log.d("count" , " number of toys " + Integer.toString(db.totalToys()));

        //Display toys on screen
        lv = findViewById(R.id.listview);
        ArrayList<String> toys = new ArrayList<>();
        for (Toy t:
             allToys) {
            toys.add(t.getToy());
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1 , toys);
        lv.setAdapter(arrayAdapter);
    }
}