package com.example.dhakatourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLalbagFort;
    Button btnAhsanMonjil;
    Button btnShahidMinar;
    Button btnAssembly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLalbagFort= findViewById(R.id.buttonLalbagFort);
        btnLalbagFort.setOnClickListener(this);

        btnAhsanMonjil= findViewById(R.id.buttonAhsanMonjil);
        btnAhsanMonjil.setOnClickListener(this);

        btnShahidMinar= findViewById(R.id.buttonShahidMinar);
        btnShahidMinar.setOnClickListener(this);

        btnAssembly= findViewById(R.id.buttonAssembly);
        btnAssembly.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonLalbagFort){
            Intent intent= new Intent(MainActivity.this, ActivityLalbagFort.class);
            startActivity(intent);
        } else if(view.getId()==R.id.buttonAhsanMonjil){
            Intent intent= new Intent(MainActivity.this, ActivityAhsanMonjil.class);
            startActivity(intent);
        } else if(view.getId()==R.id.buttonShahidMinar){
            Intent intent= new Intent(MainActivity.this, ActivityShahidMinar.class);
            startActivity(intent);
        } else if(view.getId()==R.id.buttonAssembly){
            Intent intent= new Intent(MainActivity.this, ActivityNationalAssembly.class);
            startActivity(intent);
        }
    }
}