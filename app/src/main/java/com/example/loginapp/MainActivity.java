package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText username = findViewById (R.id.username);
                String name = username.getText().toString();

             Intent intent=new Intent (MainActivity.this,secondMainActivity.class);
             intent.putExtra("username",name);
             startActivity(intent);

            }
        });

    }
}