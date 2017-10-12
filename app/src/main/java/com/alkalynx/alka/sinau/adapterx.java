package com.alkalynx.alka.sinau;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SaputraPC on 05/10/2017.
 */

public class adapterx extends RecyclerView.Adapter<adapterx.MyOwnHolder>{

    String data1[], data2[];
    int img[];
    Context ctx;
    LayoutInflater inflater;
    TextView t1,t2;
    String posisi;

    int banner[]={R.drawable.bnr0,R.drawable.bnr1,R.drawable.bnr2,R.drawable.bnr3,R.drawable.bnr4,R.drawable.bnr5,R.drawable.bnr6,R.drawable.bnr7};


    public adapterx(Context ct,String t1[],String t2[],int i1[]){
        ctx = ct;
        data1 = t1;
        data2 = t2;
        img = i1;
    }


    public class MyOwnHolder extends RecyclerView.ViewHolder{

        TextView t1,t2;
        ImageView myImage;
        CardView cardView; //Deklarasi Cardview

        public MyOwnHolder(View itemView) {
            super(itemView);

            t1 = (TextView) itemView.findViewById(R.id.textView);
            t2 = (TextView) itemView.findViewById(R.id.textView2);
            myImage = (ImageView) itemView.findViewById(R.id.poto);

            cardView = (CardView) itemView.findViewById(R.id.card_view);


        }

    }



    public adapterx(Context context) {
        this.ctx=context;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public MyOwnHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View MyOwnView = myInflator.inflate(R.layout.myrow,parent,false);
        return new MyOwnHolder(MyOwnView);
    }

    @Override
    public void onBindViewHolder(MyOwnHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t1.setOnClickListener(clickListener);
        holder.t1.setTag(holder);
        holder.t2.setText(data2[position]);
        holder.t2.setOnClickListener(clickListener);
        holder.t2.setTag(holder);
        holder.myImage.setOnClickListener(clickListener);
        holder.myImage.setImageResource(img[position]);
        holder.myImage.setTag(holder);
        holder.cardView.setOnClickListener(clickListener);
        holder.cardView.setTag(holder);
    }




    View.OnClickListener clickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            //member aksi saat cardview diklik berdasarkan posisi tertentu
            MyOwnHolder vholder = (MyOwnHolder) v.getTag();

            int position = vholder.getPosition();

            //mendapatkan string title dan gambar dinamis
            Bundle x = new Bundle();
            x.putString("judul", "Resep " + data1[position]);
            x.putInt("picture", banner[position]);

            Intent intent = new Intent(ctx , MainActivity2.class);
            intent.putExtras(x);
            ctx.startActivity(intent);

        }

    };


    @Override
    public int getItemCount() {
        return data1.length;
    }


}
