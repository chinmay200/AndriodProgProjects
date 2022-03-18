package com.example.sqliteprac.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.sqliteprac.Modal.Toy;
import com.example.sqliteprac.Params.Params;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Currency;

public class MyDbHandler extends SQLiteOpenHelper {
    public MyDbHandler(@Nullable Context context) {
        super(context, Params.DB_NAME, null, Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create = "CREATE TABLE " + Params.TABLE_NAME + "(" + Params.KEY_ID + " INTEGER PRIMARY KEY ," + Params.KEY_NAME + " VARCHAR(50) ," +Params.KEY_TYPE + " VARCHAR(50) " + ")";
        Log.d("table" , "Table sucessfully created");
        sqLiteDatabase.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addToy(Toy toy){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Params.KEY_NAME , toy.getToy());
        contentValues.put(Params.KEY_TYPE , toy.getType());

        db.insert(Params.TABLE_NAME , null ,contentValues);
        Log.d("table" , "Data successfully entered");
        db.close();
    }

    public ArrayList<Toy> getToys(){
        ArrayList<Toy> toys = new ArrayList<>();
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();

        //Query for fetching all data
        String query = "SELECT * FROM " + Params.TABLE_NAME;

        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        cursor.moveToFirst();
        do{
            Toy t = new Toy();
            t.setId(Integer.parseInt(cursor.getString(0)));
            t.setToy(cursor.getString(1));
            t.setType(cursor.getString(2));

            //Add the data collected sequence wise to toys
            toys.add(t);

        }while(cursor.moveToNext());

        return toys;
    }

    public int updateToy(Toy toy){

        //Create db object
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        //create content values for data edition or access
        ContentValues values = new ContentValues();
        values.put(Params.KEY_NAME , toy.getToy());
        values.put(Params.KEY_TYPE , toy.getType());
        String [] id = {Integer.toString(toy.getId())};

        //updates the row with where clause is matched and returns the number of affected rows
        return sqLiteDatabase.update(Params.TABLE_NAME , values , Params.KEY_ID+"=?", id );
    }
}
