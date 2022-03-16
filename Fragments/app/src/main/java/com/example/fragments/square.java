package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class square extends Fragment {


    public square() {
        // Required empty public constructor
    }
    Button b2;
    TextView ts;
    EditText side;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_square, container, false);

        b2 = v.findViewById(R.id.calculateSquareArea);
        ts = v.findViewById(R.id.squareArea);
        side = v.findViewById(R.id.side);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sd = Integer.parseInt(side.getText().toString());
//                Toast.makeText(getContext(), Integer.toString(sd), Toast.LENGTH_SHORT).show();
                double ans = sd*sd;
                ts.setText(Double.toString(ans)+"m2");
            }
        });
        return v;
    }
}