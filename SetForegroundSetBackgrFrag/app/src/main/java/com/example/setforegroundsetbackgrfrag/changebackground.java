package com.example.setforegroundsetbackgrfrag;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class changebackground extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    Button b1;
    Button b2;
    ConstraintLayout background;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_changebackground, container, false);
        b1 = v.findViewById(R.id.bcolor1);
        b2 = v.findViewById(R.id.bcolor2);
        background = v.findViewById(R.id.background);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("red"));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        return v;
    }
}