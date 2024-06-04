package com.example.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float f1,f2,f;
    Boolean add,sub,multi,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create obj for button
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        Button b3=findViewById(R.id.b3);
        Button b4=findViewById(R.id.b4);
        Button b5=findViewById(R.id.b5);
        Button b6=findViewById(R.id.b6);
        Button b7=findViewById(R.id.b7);
        Button b8=findViewById(R.id.b8);
        Button b9=findViewById(R.id.b9);
        Button zero=findViewById(R.id.zero);
        Button addBtn=findViewById(R.id.add);
        Button multiBtn=findViewById(R.id.multi);
        Button subBtn=findViewById(R.id.sub);
        Button divBtn=findViewById(R.id.div);
        Button equal=findViewById(R.id.equal);
        Button dot=findViewById(R.id.dot);
        Button clear=findViewById(R.id.clear);
        Button ac=findViewById(R.id.ac);

        //create edittext obj
        EditText et=findViewById(R.id.et1);

        //onclick for all button
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(".");
            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et.getText().toString());
                et.setText("");
                add=true;
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et.getText().toString());
                et.setText("");
                sub=true;
            }
        });
        multiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et.getText().toString());
                et.setText("");
                multi=true;
            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et.getText().toString());
                et.setText("");
                div=true;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1+f2;
                    String num=String.valueOf(f);
                    add=false;
                }else if(sub==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1-f2;
                    String num=String.valueOf(f);
                    sub=false;
                }else if(multi==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1*f2;
                    String num=String.valueOf(f);
                    multi=false;
                }else if(div==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1/f2;
                    String num=String.valueOf(f);
                    div=false;

                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1+f2;
                    et.setText(String.valueOf(f));
                    add=false;
                }else if(sub==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1-f2;
                    et.setText(String.valueOf(f));
                    sub=false;
                }else if(multi==true){
                    f2=Float.parseFloat(et.getText().toString());
                    f=f1*f2;
                    et.setText(String.valueOf(f));
                    multi=false;
                }else if(div==true){
                    f2=Float.parseFloat(et.getText().toString());
                    if(f2 != 0) {
                        f=f1/f2;
                        et.setText(String.valueOf(f));
                    } else {
                        et.setText("Error: Division by zero");
                    }
                    div=false;
                }
            }
        });

    }

    }

