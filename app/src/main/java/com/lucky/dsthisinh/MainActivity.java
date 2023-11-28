package com.lucky.dsthisinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btn_ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ds = findViewById(R.id.btn_ds);
        btn_ds.setOnClickListener(v -> {
            startActivity(new Intent(this, StudentActivity.class));
        });
    }
}