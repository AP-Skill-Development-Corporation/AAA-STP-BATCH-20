package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyDataAdapter extends RecyclerView.Adapter<MyDataAdapter.MyViewHolder> {

    Context ct;
    String[] myname;
    int[] myimage;

    public MyDataAdapter(MainActivity mainActivity, String[] names, int[] images) {
        ct = mainActivity;
        myimage = images;
        myname = names;
    }

    @NonNull
    @Override
    public MyDataAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(ct).inflate(R.layout.row_design,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyDataAdapter.MyViewHolder holder, int position) {

        holder.iv.setImageResource(myimage[position]);
        holder.tv.setText(myname[position]);
    }

    @Override
    public int getItemCount() {
        return myimage.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imageview);
            tv = itemView.findViewById(R.id.textview);
        }
    }
}
