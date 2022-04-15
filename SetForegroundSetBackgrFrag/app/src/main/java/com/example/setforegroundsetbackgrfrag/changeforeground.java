package com.example.setforegroundsetbackgrfrag;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class changeforeground extends Fragment {
    public changeforeground() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    Button f1;
    Button f2;
    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_changeforeground, container, false);
        f1 = v.findViewById(R.id.fcolor1);
        f2 = v.findViewById(R.id.fcolor2);
        tv = v.findViewById(R.id.change);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setTextColor(getResources().getColor(R.color.red));
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setTextColor(getResources().getColor(R.color.green));
            }
        });
        return v;
    }
}