package com.lucky.dsthisinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailStudentActivity extends AppCompatActivity {

    EditText id;
    EditText name;
    EditText result;
    LinearLayout layout_student;

    Button btn_update;
    Button btn_back;

    StudentModel student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_student);

        id = findViewById(R.id.id_tv);
        name = findViewById(R.id.name_tv);
        result = findViewById(R.id.result_tv);
        btn_back = findViewById(R.id.btn_back);
//        layout_student = findViewById(R.id.layout_student);

        id.setText(getIntent().getStringExtra("id"));
        name.setText(getIntent().getStringExtra("name"));
        result.setText(getIntent().getStringExtra("result"));

        btn_back.setOnClickListener(view -> {
            onBackPressed();
        });
    }
}