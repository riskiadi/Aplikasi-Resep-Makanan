package com.alkalynx.alka.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel reyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menampilkan reyclerview yang ada pada file layout dengan id reycler view
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);

        //membuat adapter baru untuk reyclerview
        RecyclerAdapter adapter=new RecyclerAdapter(this);

        //menset nilai dari adapter
        recyclerView.setAdapter(adapter);

        //menset setukuran
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //dalam bentuk linearlayoutmanager pada class saat ini


    }
}
