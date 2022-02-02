package com.example.digitbits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add;
    Button sub;
    Button mul;
    Button div;
    double sol;
    TextView num1,num2,op1,op2,op;
    TextView solution;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = this.findViewById(R.id.number1);
        num2 = this.findViewById(R.id.number2);
        solution = this.findViewById(R.id.sol);
        add = this.findViewById(R.id.add);
        sub = this.findViewById(R.id.sub);
        mul = this.findViewById(R.id.mul);
        div = this.findViewById(R.id.div);
        op1 = this.findViewById(R.id.op1);
        op2 = this.findViewById(R.id.op2);
        op = this.findViewById(R.id.op);
    }

    public void calculation(View v){
        int id = v.getId();
        if(id == add.getId()){
            op1.setText(String.valueOf(num1.getText()));
            op2.setText(String.valueOf(num2.getText()));
            op.setText("+");
            sol = Integer.parseInt(String.valueOf(num1.getText())) + Integer.parseInt(String.valueOf(num2.getText()));
            solution.setText(String.valueOf(sol));
        }

        else if(id == sub.getId()){
            op1.setText(String.valueOf(num1.getText()));
            op2.setText(String.valueOf(num2.getText()));
            op.setText("-");
            sol = Integer.parseInt(String.valueOf(num1.getText())) - Integer.parseInt(String.valueOf(num2.getText()));
            solution.setText(String.valueOf(sol));
        }
        else if(id == mul.getId()){
            op1.setText(String.valueOf(num1.getText()));
            op2.setText(String.valueOf(num2.getText()));
            op.setText("x");
            sol = Integer.parseInt(String.valueOf(num1.getText())) * Integer.parseInt(String.valueOf(num2.getText()));
            solution.setText(String.valueOf(sol));
        }
        else{
            op1.setText(String.valueOf(num1.getText()));
            op2.setText(String.valueOf(num2.getText()));
            op.setText("/");
            if(Integer.parseInt(String.valueOf(num2.getText())) == 0){
                solution.setText("Not defined");
            }
            else{
            sol = Integer.parseInt(String.valueOf(num1.getText())) / Integer.parseInt(String.valueOf(num2.getText()));
            solution.setText(String.valueOf(sol));
            }
        }
    }
}