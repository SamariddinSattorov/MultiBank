package com.example.bankomonat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class TaklifOynasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_taklif_oynasi);




        findViewById(R.id.taklif_card_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { clicked_btn("https://tbcbank.uz/ru/product/depozity?utm_source=Bank-uz&utm_medium=Blog&utm_campaign=Deposit");
            }
        });


        findViewById(R.id.taklif_card_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { clicked_btn("https://nbu.uz/uz/physical/credits/iste-mol-krediti/");
            }
        });


    }
    public void clicked_btn(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
        {

        }
    }
}