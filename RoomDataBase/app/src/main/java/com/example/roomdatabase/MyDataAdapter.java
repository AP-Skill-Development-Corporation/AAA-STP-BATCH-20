package com.example.roomdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyDataAdapter extends RecyclerView.Adapter<MyDataAdapter.MyViewHolder> {

    Context ct;
    List<Student> list;

    public MyDataAdapter(MainActivity mainActivity, List<Student> studentList) {
        ct = mainActivity;
        list = studentList;
    }

    @NonNull
    @Override
    public MyDataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ct).inflate(R.layout.row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyDataAdapter.MyViewHolder holder, int position) {
        final Student student = list.get(position);
        holder.rname.setText(student.getName());
        holder.rmail.setText(student.getMailID());
        holder.rphone.setText(student.getPhone());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MainActivity.dataBase.myDao().delete(student);
                MainActivity.viewModel.delete(student);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView rname,rmail,rphone;
        Button delete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            rname = itemView.findViewById(R.id.readname);
            rmail = itemView.findViewById(R.id.readmail);
            rphone = itemView.findViewById(R.id.readphone);
            delete = itemView.findViewById(R.id.delete);

        }
    }
}
