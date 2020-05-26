package com.passionategeekz.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder>{
    private  String[] data;
    public  MyAdapter(String[] data)
    {
            this.data=data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.list_view,parent, false);

        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        String title= data[position];
        holder.tt.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class holder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView tt;

        public holder(@NonNull View itemView) {
            super(itemView);
            img= (ImageView)itemView.findViewById(R.id.cc);
            tt =(TextView)itemView.findViewById(R.id.textView);
        }
    }
}