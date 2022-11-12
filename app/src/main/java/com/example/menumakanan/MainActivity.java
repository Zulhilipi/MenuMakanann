package com.example.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //MAKANAN
        final CheckBox makanan1 = findViewById(R.id.honeygalicchickenrice);
        final CheckBox makanan2 = findViewById(R.id.beefburger);
        final CheckBox makanan3 = findViewById(R.id.regularfries);

        //MINUMAN
        final CheckBox minuman1 = findViewById(R.id.icecreamcone);
        final CheckBox minuman2 = findViewById(R.id.flurryoreo);
        final CheckBox minuman3 = findViewById(R.id.fantafloat);

        //KEVIN RAHAKBAUW
        //TIF RM20
        //MOBILE PROGRAMING 1

        //JUMLAH MAKANAN
        final EditText jml_mkn1 = findViewById(R.id.jumlahhoneygarlicchickenrice);
        final EditText jml_mkn2 = findViewById(R.id.jumlahbeefburger);
        final EditText jml_mkn3 = findViewById(R.id.jumlahregulerfries);

        //JUMLAH MINUMAN
        final EditText jml_min1 = findViewById(R.id.jumlahicecreamcone);
        final EditText jml_min2 = findViewById(R.id.jumlahflurryoreo);
        final EditText jml_min3 = findViewById(R.id.jumlahfantafloat);
        Button btn = findViewById(R.id.submit);

        //HARGA MAKANAN
        final int harga_honeygalicchickenrice = 35000;
        final int harga_beefburger = 30000;
        final int harga_regularfries = 25000;

        //HARGA MINUMAN
        final int harga_icecreamcone = 10000;
        final int harga_flurryoreo = 18000;
        final int harga_fantafloat = 15000;

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!makanan1.isChecked() && !makanan2.isChecked() && !makanan3.isChecked() && !minuman1.isChecked() && !minuman2.isChecked() && !minuman3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Silahkan Pilih Makanan dan Minuman", Toast.LENGTH_SHORT).show();
                } else {
                    String text = "";
                    int totOrder = 0;
                    int discount = 0;
                    if (makanan1.isChecked()) {
                        String hasil = "Honey Garlic Chicken Rice ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn1.getText()));
                        int cal = jml * harga_honeygalicchickenrice;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;

                    }
                    if (makanan2.isChecked()) {
                        String hasil = "Honey Garlic Chicken Rice ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn2.getText()));
                        int cal = jml * harga_beefburger;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (makanan3.isChecked()) {
                        String hasil = "Honey Garlic Chicken Rice ";
                        int jml = Integer.parseInt(String.valueOf(jml_mkn3.getText()));
                        int cal = jml * harga_regularfries;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }

                    //MINUMAN

                    if (minuman1.isChecked()) {
                        String hasil = "Honey Garlic Chicken Rice ";
                        int jml = Integer.parseInt(String.valueOf(jml_min1.getText()));
                        int cal = jml * harga_icecreamcone;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (minuman2.isChecked()) {
                        String hasil = "Honey Garlic Chicken Rice ";
                        int jml = Integer.parseInt(String.valueOf(jml_min2.getText()));
                        int cal = jml * harga_flurryoreo;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (minuman3.isChecked()) {
                        String hasil = "Honey Garlic Chicken Rice ";
                        int jml = Integer.parseInt(String.valueOf(jml_min3.getText()));
                        int cal = jml * harga_fantafloat;
                        text += jml + "\t\t" + hasil + "\t\t\t\t\t\t\t\t\t" + "Rp. " + cal + "\n\n";
                        totOrder = totOrder + cal;
                    }
                    if (totOrder > 100000) {
                        discount = 10000;
                    }
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("Coba", text);
                    intent.putExtra("Bayar", totOrder);
                    intent.putExtra("Discout", discount);
                    startActivity(intent);
                }
            }


        });

    }


}