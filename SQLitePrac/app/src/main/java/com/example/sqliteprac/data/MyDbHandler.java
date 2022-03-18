package com.example.sqliteprac.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.sqliteprac.Modal.Toy;
import com.example.sqliteprac.Params.Params;

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
}
