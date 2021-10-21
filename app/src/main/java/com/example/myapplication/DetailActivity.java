package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

//import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewResult;
    Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textViewResult = (TextView) findViewById(R.id.hasil);
        buttonBack = (Button) findViewById(R.id.back);

            String hasil = getIntent().getStringExtra("Hasil");
            textViewResult.setText(hasil);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
