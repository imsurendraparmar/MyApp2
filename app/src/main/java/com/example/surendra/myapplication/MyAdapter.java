package com.example.surendra.myapplication;

import android.support.annotation.StringDef;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Surendra on 08-05-2019.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset;
    public MyAdapter(String[] mDataset)
    {
        this.mDataset = mDataset;
    }

    public  MyViewHolder onCreateViewHolder(ViewGroup parent , int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return  vh;
    }
    public void onBindViewHolder(MyViewHolder holder,int position){
        holder.textView.setText(mDataset[position]);
    }

    public int getItemCount(){return  mDataset.length;}
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public MyViewHolder(View v){
            super(v);
            this.textView =(TextView ) itemView.findViewById(R.id.textView);
        }
    }
}
