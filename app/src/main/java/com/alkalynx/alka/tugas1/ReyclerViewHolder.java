package com.alkalynx.alka.tugas1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SaputraPC on 30/09/2017.
 */

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    // ViewHolder akan mendeskripisikan item view yang ditempatkan di dalam RecyclerView.
    TextView tv1,tv2; //deklarasi textview
    ImageView imageView;  //deklarasi imageview
    CardView cardView; //Deklarasi Cardview

    public RecyclerViewHolder(View itemView) {

        super(itemView);

        //menampilkan text dari widget CardView pada id daftar_judul
        tv1 = (TextView) itemView.findViewById(R.id.daftar_judul);

        //menampilkan text deskripsi dari widget CardView pada id daftar_deskripsi
        tv2 = (TextView) itemView.findViewById(R.id.daftar_deskripsi);

        //menampilkan gambar atau icon pada widget Cardview pada id daftar_icon
        imageView = (ImageView) itemView.findViewById(R.id.daftar_icon);

        cardView = (CardView) itemView.findViewById(R.id.card_view);




    }
}
