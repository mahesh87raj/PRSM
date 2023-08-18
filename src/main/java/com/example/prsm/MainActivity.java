package com.example.prsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.E1);
        t2=findViewById(R.id.E2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=t1.getText().toString();
                String b=t2.toString().toString();
                if (a.equals("8707324442")&&b.equals("00000000")){
                    Intent obj=new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(obj);

                    Toast.makeText(MainActivity.this, " Log Sucessfull", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(getApplicationContext(), "Invalid User", Toast.LENGTH_SHORT);


                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(obj);
                Toast.makeText(MainActivity.this, " Open New page", Toast.LENGTH_SHORT).show();
            }
        });

    }
    }