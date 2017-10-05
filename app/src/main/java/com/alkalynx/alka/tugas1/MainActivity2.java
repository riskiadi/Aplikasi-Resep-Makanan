package com.alkalynx.alka.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
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

        imageView = (ImageView) findViewById(R.id.banner);

        Bundle x = getIntent().getExtras();
        setTitle(x.getString("Resep"));
        imageView.setImageResource(x.getInt("picture"));

        textView1 = (TextView) findViewById(R.id.resep);
        textView1.setText("Bahan Bahan: \n - 500 gr nasi putih\n- 125 gr daging ayam yang telah dicincang halus\n- 1 buah wortel yang telah dipotong dadu\n- 1/2 ikat sawi atau kol secukupnya yang telah dipotong-potong (sebagai sayur tambahan jika suka)\n- 2 sdm kecap manis");

        textView2 = (TextView) findViewById(R.id.caraBuat);
        textView2.setText("Cara Pembuatan: \n - Campurkan bawang merah, bawang putih dan cabai ke dalam cobek lalu uleg atau haluskan sampai rata\n- Masukkan minyak secukupnya ke dalam wajan, kemudian panaskan\n- Masukkan campuran bumbu yang telah dihaluskan ke dalam minyak yang telah panas, kemudian tumis hingga harum\n- Sisihkan bumbu yang telah ditumis pada pinggiran wajan, kemudian masukkan kocokan telur, aduk rata telur hingga menggumpal-gumpal kecil\n- Kemudian masukkan daging ayam yang telah dicincang halus, masak hingga warnanya berubah agak kuning kecoklatan\n- Tambahkan potongan kol atau sawi dan wortel ke dalam masakan, kemudian aduk-aduk\n- Selanjutnya masukkan garam, kecap manis dan kecap asin, aduk terus hingga tercampur rata\n- Terakhir, masukkan nasi putih, aduk-aduk hingga semua bahan dan bumbu merata dengan nasinya\n- Sebelum disajikan jangan lupa untuk mencicipi masakan terlebih dahulu, jika sudah yakin dengan rasanya silahkan angkat dan sajikan selagi hangat, tambahkan juga acar timun dan kerupuk udang sebagai bahan pelengkap. Yumm!");






    }
}
