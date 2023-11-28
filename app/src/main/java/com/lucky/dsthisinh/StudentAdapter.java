package com.lucky.dsthisinh;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{

    private ArrayList<StudentModel> dataList;
    private Context context;

    public StudentAdapter(ArrayList<StudentModel> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.student_item, parent, false);

        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        StudentModel student = dataList.get(position);
        holder.id.setText(student.getId());
        holder.name.setText(student.getName());
        holder.result.setText(student.getResult());
        holder.layout_student.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailStudentActivity.class);
            intent.putExtra("id", student.getId());
            intent.putExtra("name", student.getName());
            intent.putExtra("result", student.getResult());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView name;
        TextView result;
        LinearLayout layout_student;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_tv);
            name = itemView.findViewById(R.id.name_tv);
            result = itemView.findViewById(R.id.result_tv);
            layout_student = itemView.findViewById(R.id.layout_student);
        }
    }
}

