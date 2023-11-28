package com.lucky.dsthisinh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<StudentModel> dataList;
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataList = new ArrayList<StudentModel>();
        dataList.add(new StudentModel("1", "An", "9"));
        dataList.add(new StudentModel("2", "Bình", "10"));
        dataList.add(new StudentModel("3", "Chi", "9"));
        dataList.add(new StudentModel("4", "Dương", "8"));
        dataList.add(new StudentModel("5", "Hà", "9"));
        adapter = new StudentAdapter(dataList, this);
        recyclerView.setAdapter(adapter);
    }
}