package com.example.relativeconstraintcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    TextView result;
    MaterialButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9;
    MaterialButton bracket1, bracket2, plus, minus, multiply, divided, equals, clear;
    MaterialButton numac, numdot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        result = findViewById(R.id.result);

        assignId(num0,R.id.num0);
        assignId(num1,R.id.num1);
        assignId(num2,R.id.num2);
        assignId(num3,R.id.num3);
        assignId(num4,R.id.num4);
        assignId(num5,R.id.num5);
        assignId(num6,R.id.num6);
        assignId(num7,R.id.num7);
        assignId(num8,R.id.num8);
        assignId(num9,R.id.num9);
        assignId(bracket1,R.id.bracket1);
        assignId(bracket2,R.id.bracket2);
        assignId(plus,R.id.plus);
        assignId(minus,R.id.minus);
        assignId(multiply,R.id.multiply);
        assignId(divided,R.id.divided);
        assignId(equals,R.id.equals);
        assignId(clear,R.id.clear);
        assignId(numac,R.id.numac);
        assignId(numdot,R.id.numdot);
    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}