package com.example.visitsrilanka;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class South extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.Home:
                Intent intent = new Intent(South.this,MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.place:
                Intent intent1 = new Intent(South.this,Place.class);
                startActivity(intent1);
                return true;

            case R.id.aboutUs:
                Intent intent2 = new Intent(South.this,About.class);
                startActivity(intent2);
                return true;

            case R.id.logOut:
                Intent intent3 = new Intent(South.this,Login.class);
                startActivity(intent3);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);
    }
}