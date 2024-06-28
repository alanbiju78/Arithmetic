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

public class Evenorodd extends AppCompatActivity {
    EditText e1;
    AppCompatButton bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_evenorodd);
        e1=(EditText) findViewById(R.id.n1);
        bt1=(AppCompatButton) findViewById(R.id.chkbt);
        bt2=(AppCompatButton) findViewById(R.id.btmbt);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String num1= e1.getText().toString();
                    int numb1=Integer.parseInt(num1);
                   int numb2=numb1%2;
                    if(numb2==0) {
                        Toast.makeText(getApplicationContext(),"Even number",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Odd number",Toast.LENGTH_LONG).show();
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