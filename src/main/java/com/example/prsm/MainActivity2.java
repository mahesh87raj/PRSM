package com.example.prsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText t1,t2,t3,t4,t5,t6,t7,t8,t9;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.E1);
        t2=findViewById(R.id.E2);
        t3=findViewById(R.id.E3);
        t4=findViewById(R.id.E4);
        t5=findViewById(R.id.E5);
        t6=findViewById(R.id.E6);
        t7=findViewById(R.id.E7);
        t8=findViewById(R.id.E8);
        t9=findViewById(R.id.E9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=t1.getText().toString();
                String b=t2.getText().toString();
                String c=t3.getText().toString();
                String d=t4.getText().toString();
                String e=t5.getText().toString();
                String f=t6.getText().toString();
                String g=t7.getText().toString();
                String h=t8.getText().toString();
                String i=t9.getText().toString();
                Intent obj=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(obj);
                Toast.makeText(MainActivity2.this, "Submit Sucessfull", Toast.LENGTH_SHORT).show();

            }
        });
    }
}