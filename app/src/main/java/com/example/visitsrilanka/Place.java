package com.example.visitsrilanka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Place extends AppCompatActivity {

    ImageButton eastBtn,northBtn,northcenterBtn,northwestBtn,southBtn,uvaBtn;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.Home:
                Intent intent = new Intent(Place.this,MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.place:
                Intent intent1 = new Intent(Place.this,Place.class);
                startActivity(intent1);
                return true;

            case R.id.aboutUs:
                Intent intent2 = new Intent(Place.this,About.class);
                startActivity(intent2);
                return true;

            case R.id.logOut:
                Intent intent3 = new Intent(Place.this,Login.class);
                startActivity(intent3);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        eastBtn = findViewById(R.id.eastBtn);
        northBtn = findViewById(R.id.northBtn);
        northcenterBtn = findViewById(R.id.northcenterBtn);
        northwestBtn = findViewById(R.id.northwestBtn);
        southBtn = findViewById(R.id.southBtn);
        uvaBtn = findViewById(R.id.uvaBtn);

        eastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Place.this, East.class));
            }
        });
        northBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Place.this, North.class));
            }
        });
        northcenterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Place.this, Northcenter.class));
            }
        });
        northwestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Place.this, Northwest.class));
            }
        });
        southBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Place.this, South.class));
            }
        });
        uvaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Place.this, Uva.class));
            }
        });
    }
}