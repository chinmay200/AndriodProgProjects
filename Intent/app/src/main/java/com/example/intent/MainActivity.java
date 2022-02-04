package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = this.findViewById(R.id.name);
        username = this.findViewById(R.id.username);
    }

    public void enter(View v){
        Intent in = new Intent(MainActivity.this , MainActivity2.class);
        person p = new person();
        p.setName(name.getText().toString());
        p.setUsername(username.getText().toString());

        in.putExtra("person" , p);
        startActivity(in);
    }
}