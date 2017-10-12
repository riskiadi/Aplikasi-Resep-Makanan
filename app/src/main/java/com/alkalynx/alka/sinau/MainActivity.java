package com.alkalynx.alka.sinau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String t1[],t2[];
    CardView cardView;
    int imageResource[]={R.drawable.arr0,R.drawable.arr1,R.drawable.arr2,R.drawable.arr3,R.drawable.arr4,R.drawable.arr5,R.drawable.arr6,R.drawable.arr7};
    adapterx ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.rec);

        cardView = (CardView) findViewById(R.id.card_view);

        t1 = getResources().getStringArray(R.array.judul);
        t2 = getResources().getStringArray(R.array.deskripsi);

        ad = new adapterx(this,t1,t2,imageResource);

        recyclerView.setAdapter(ad);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
