package com.example.bankomonat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class OmonatActivity extends AppCompatActivity {

    private ImageView agrobankID, sqbID, turonbankID, asakaID, mikrobankID, ipotekaID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_omonat);

        agrobankID = (ImageView) findViewById(R.id.agrobankID);
        sqbID = (ImageView) findViewById(R.id.sqbID);
        turonbankID = (ImageView) findViewById(R.id.turonbankID);
        asakaID = (ImageView) findViewById(R.id.asakaID);
        mikrobankID = (ImageView) findViewById(R.id.mikrobankID);
        ipotekaID = (ImageView) findViewById(R.id.ipotekaID);


        // AGROBANK ACTIVITY

        agrobankID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity1();
            }
            private void openActivity1() {
                Intent agrobank = new Intent(OmonatActivity.this, AgrobankActivity.class);
                startActivity(agrobank);
            }
        });



        // SQB ACTIVITY

        sqbID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity2();
            }
            private void openActivity2() {
                Intent sqbbank = new Intent(OmonatActivity.this, SqbActivity.class);
                startActivity(sqbbank);
            }
        });


        // TURONBANK ACTIVITY

        turonbankID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity3();
            }
            private void openActivity3() {
                Intent turonbank = new Intent(OmonatActivity.this, TuronBankActivity.class);
                startActivity(turonbank);
            }
        });



        // ASAKABANK ACTIVITY

        asakaID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity4();
            }
            private void openActivity4() {
                Intent asakabank = new Intent(OmonatActivity.this, AsakaBankActivity.class);
                startActivity(asakabank);
            }
        });


        // MIKROKREDIT ACTIVITY

        mikrobankID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity5();
            }
            private void openActivity5() {
                Intent mikrobank = new Intent(OmonatActivity.this, MikroKreditActivity.class);
                startActivity(mikrobank);
            }
        });



        // IPOTEKABANK ACTIVITY

        ipotekaID.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity6();
            }
            private void openActivity6() {
                Intent ipoteka = new Intent(OmonatActivity.this, IpotekaBankActivity.class);
                startActivity(ipoteka);
            }
        });


    }
}