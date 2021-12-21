package com.example.program;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PageAcceuille extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_acceuille);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(PageAcceuille.this, PageAcceuille2.class));
            finish();
        }, 1000);
    }
}