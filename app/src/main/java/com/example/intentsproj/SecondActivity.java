package com.example.intentsproj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txt1,txt2,cal;
    Button button_plus,button_minus,button_multiply,button_divide;
    String para1,para2;
    int n1,n2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        setContentView(R.layout.second_activity);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        txt1 = (TextView) findViewById(R.id.editText1);

        txt2 = (TextView) findViewById(R.id.editText2);

        cal = (TextView) findViewById(R.id.calculation);

        button_plus =(Button)findViewById(R.id.button_plus);

        button_minus =(Button)findViewById(R.id.button_minus);

        button_multiply =(Button)findViewById(R.id.button_multiply);

        button_divide =(Button)findViewById(R.id.button_divide);


        Intent intent = getIntent();

        para1 = intent.getStringExtra("num1");
        para2 = intent.getStringExtra("num2");

        txt1.setText(para1);
        txt2.setText(para2);

          n1 = Integer.parseInt(para1);
          n2 = Integer.parseInt(para2);

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.setText(n1+" + "+n2+" = "+(n1+n2));

            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.setText(n1+" - "+n2+" = "+(n1-n2));

            }
        });

        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.setText(n1+" x "+n2+" = "+(n1*n2));

            }
        });

        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.setText(n1+" / "+n2+" = "+(n1/n2));

            }
        });


    }



    }






