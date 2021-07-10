package com.example.budgetmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class LogoutActivity extends AppCompatActivity {
    SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        pref = getApplicationContext().getSharedPreferences("UserData",MODE_PRIVATE);
        SharedPreferences.Editor edt = pref.edit();
        edt.clear();
        edt.commit();
        Toast.makeText(this,"Logged out successfully",Toast.LENGTH_LONG).show();
        Intent in = new Intent(this, MainActivity.class);
        startActivity(in);
    }
}
