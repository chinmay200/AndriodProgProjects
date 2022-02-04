package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name;
    TextView username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = this.findViewById(R.id.nameview);
        username = this.findViewById(R.id.usernameview);
        person p = (person) getIntent().getSerializableExtra("person");

        name.setText(p.getName());
        username.setText(p.getUsername());
    }
}