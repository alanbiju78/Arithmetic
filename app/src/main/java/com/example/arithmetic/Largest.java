package com.example.arithmetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Largest extends AppCompatActivity {
    EditText e1,e2;
    AppCompatButton bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_largest);
        e1=(EditText) findViewById(R.id.n1);
        e2=(EditText) findViewById(R.id.n2);
        bt1=(AppCompatButton) findViewById(R.id.combt);
        bt2=(AppCompatButton) findViewById(R.id.btmbt);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String num1= e1.getText().toString();
                    String num2= e2.getText().toString();
                    int numb1=Integer.parseInt(num1);
                    int numb2=Integer.parseInt(num2);
                    if(numb1>numb2) {
                        Toast.makeText(getApplicationContext(),num1+" is greater",Toast.LENGTH_LONG).show();
                    }
                    else if(numb2>numb1){
                        Toast.makeText(getApplicationContext(),num2+" is greater",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Numbers are equal",Toast.LENGTH_LONG).show();
                    }
                }
                catch (Exception E){
                    Toast.makeText(getApplicationContext(),"Exception occurred",Toast.LENGTH_LONG).show();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), com.example.arithmetic.MainActivity.class);
                startActivity(i);
            }
        });
    }
}