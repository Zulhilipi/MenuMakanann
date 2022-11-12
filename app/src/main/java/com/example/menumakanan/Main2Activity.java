package com.example.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text = findViewById(R.id.berhasil);
        TextView total1 = findViewById(R.id.total);
        TextView bel = findViewById(R.id.belanja);
        Intent intent = getIntent();
        String sum = intent.getStringExtra("Coba");

        int tot = intent.getIntExtra("Bayar", 0);
        int discount = intent.getIntExtra("Discount", 0);
        int belanja = tot - discount;
        text.setText(sum);
        total1.setText("Rp. " + tot);
        bel.setText("Rp. " + belanja);

    }
}
