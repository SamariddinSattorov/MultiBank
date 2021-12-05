package com.example.bankomonat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class TanlashOynasi extends AppCompatActivity {

    private CardView kreditbutton, omonatbutton, taklif_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tanlash_oynasi);
        kreditbutton = (CardView) findViewById(R.id.kreditbutton);
        omonatbutton = (CardView) findViewById(R.id.omonatbutton);
        taklif_button = (CardView) findViewById(R.id.taklif_button);

        kreditbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }

            private void openActivity1() {
                Intent kreditINTENT = new Intent(TanlashOynasi.this, KreditActivity.class);
                startActivity(kreditINTENT);
            }

        });

        omonatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }

            private void openActivity2() {
                Intent kreditOMONAT = new Intent(TanlashOynasi.this, OmonatActivity.class);
                startActivity(kreditOMONAT);
            }

        });


        taklif_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }

            private void openActivity3() {
                Intent taklifButton = new Intent(TanlashOynasi.this, TaklifOynasi.class);
                startActivity(taklifButton);
            }

        });

    }
}
