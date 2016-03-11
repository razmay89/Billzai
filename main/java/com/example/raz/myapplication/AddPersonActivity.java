package com.example.raz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.Adapter;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class AddPersonActivity extends AppCompatActivity {


    //m_recyclerView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);
        List<String> item = new ArrayList<>();
        personadapter personadapter = new personadapter(item);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4,GridLayoutManager.HORIZONTAL,false);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.personRecView);
        recyclerView.setAdapter(personadapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setHasFixedSize(true);
        personadapter.add("");
        personadapter.add("");
        personadapter.add("");
        personadapter.add("");
        personadapter.add("");




    }
public class personadapter extends RecyclerView.Adapter<personadapter.person>{
List<String> item = new ArrayList<>();
    public personadapter(List<String> item) {
        this.item = item;
    }

    @Override
    public person onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item1,parent,false);


        return new person(view);
    }

    @Override
    public void onBindViewHolder(person holder, int position) {

        if(position == item.size()){
        holder.plus.setImageDrawable(holder.itemView.getContext().getResources().getDrawable(R.drawable.ic_add_white_48dp));
        }else {

        }

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class person extends RecyclerView.ViewHolder{

        ImageView plus;

        public person(View itemView) {
            super(itemView);
            plus = (ImageView) findViewById(R.id.plus);
        }
    }

    public void add(String name){
        item.add(name);
        notifyDataSetChanged();
    }
}
    //
}
