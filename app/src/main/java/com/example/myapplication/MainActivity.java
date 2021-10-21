package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText p1, p2;
    Button onSubmit;
    TextView tvHasil;
    Spinner ipSpinner;
    String indikator="kosong";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1=(EditText) findViewById(R.id.pilih1);
        p2=(EditText) findViewById(R.id.pilih2);
//        tvHasil=(TextView) findViewById(R.id.hasil);
        onSubmit=(Button) findViewById(R.id.Sama_Dengan);
        ipSpinner=(Spinner) findViewById(R.id.spinner_as);
        onSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indikator=ipSpinner.getSelectedItem().toString();
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
//                String nilai = String.valueOf(hitungHasil());
                intent.putExtra("Hasil", hitungHasil());
                startActivity(intent);

               // Perintah Intent Explicit pindah halaman ke activity_detai
            }
        });
//        onSubmit.setOnClickListener((view) -> {
//
//            tvHasil.setText(hitungHasil()+"");
//        });
    }
    public String hitungHasil(){
        double bil1, bil2, total;
        bil1=Double.valueOf(p1.getText().toString().trim());
        bil2=Double.valueOf(p2.getText().toString().trim());
        switch (indikator) {
            case "Tambah":
                total=bil1+bil2;
                break;
            case "Kurang" :
                total=bil1-bil2;
                break;
            case "Kali" :
                total=bil1*bil2;
                break;
            case "Bagi" :
                total=bil1/bil2;
                break;
            default:
                total=0;
                break;
        }
        return total+"";
    }
}
