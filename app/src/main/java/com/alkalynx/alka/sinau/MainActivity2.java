package com.alkalynx.alka.sinau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //deklarasi variabel reyclerview
    RecyclerView recyclerView;
    TextView title;
    ImageView imageView;
    TextView textView1,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String resep[] = getResources().getStringArray(R.array.resep);
        final String langkah[] = getResources().getStringArray(R.array.langkah);

        imageView = (ImageView) findViewById(R.id.banner);

        Bundle x = getIntent().getExtras();

        setTitle(x.getString("judul"));
        imageView.setImageResource(x.getInt("picture"));

        textView1 = (TextView) findViewById(R.id.resep);
        textView1.setText(resep[0]);

        textView2 = (TextView) findViewById( R.id.caraBuat);
        textView2.setText(langkah[0]);




    }
}
