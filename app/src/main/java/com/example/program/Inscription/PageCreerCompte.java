package com.example.program.Inscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.program.R;

public class PageCreerCompte extends AppCompatActivity {

    private TextView person, entreprise, structure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_creer_compte);

        person= findViewById(R.id.id_pp);
        entreprise= findViewById(R.id.id_entr);
        structure= findViewById(R.id.id_admi);

        person.setOnClickListener(v -> startActivity(new Intent(PageCreerCompte.this, PagePersonne.class)));
        entreprise.setOnClickListener(v -> startActivity(new Intent(PageCreerCompte.this, PageEntreprise.class)));
        structure.setOnClickListener(v -> startActivity(new Intent(PageCreerCompte.this, PageStructure.class)));
    }
}