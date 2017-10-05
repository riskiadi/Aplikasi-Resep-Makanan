package com.alkalynx.alka.tugas1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by SaputraPC on 30/09/2017.
 */

class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

    //deklarasi variable context

    private final Context context;

    String [] name={"Nasi Goreng","Pecel","Sandwich","Soto","Kue Bandung","Martabak"};
    String [] desc={"Cara Membuat "};

    int [] images = {R.drawable.arr0, R.drawable.arr1, R.drawable.arr2, R.drawable.arr3, R.drawable.arr4, R.drawable.arr5};

    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        int imagex = images[position];
        holder.tv1.setText(name[position]);
        holder.tv2.setText(desc[0] + name[position]);
        holder.cardView.setOnClickListener(clickListener);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.cardView.setTag(holder);
        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);
        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(imagex);

    }





    View.OnClickListener clickListener=new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            //mendapatkan string title dinamis
            Bundle x = new Bundle();
            x.putString("Resep", "Resep " + name[position]);
            //Mendapatkan gambar dinamis
            x.putInt("picture", images[position]);

            Toast.makeText(context,"Membuka resep " + name[position],Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context , MainActivity2.class);
            intent.putExtras(x);
            context.startActivity(intent);

        }
    };


    @Override
    public int getItemCount() {
        return name.length;
    }
}