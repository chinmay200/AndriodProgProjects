package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class circle extends Fragment {


    public circle() {
        // Required empty public constructor
    }
    Button b1;
    TextView tv;
    EditText radius;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_circle, container, false);

        b1 = v.findViewById(R.id.calculateCircleArea);
        tv = v.findViewById(R.id.circleArea);
        radius = v.findViewById(R.id.radius);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rad = Integer.parseInt(radius.getText().toString());
                double ans = 4*3.14*rad*rad;

                tv.setText(Double.toString(ans)+"m2");
            }
        });
        return v;
    }
}