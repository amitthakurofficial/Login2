package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=editText1.getText().toString().trim();
                String s2=editText2.getText().toString().trim();
                if(s1.equals("amit.gla_mca18@gla.ac.in") && s2.equals("Amit@123"))
                {
                    Toast.makeText(MainActivity.this,"Successfully logged in",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"invalid username/password ",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}

