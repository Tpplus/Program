package com.example.program.Inscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.program.PageAcceuille;
import com.example.program.R;
import com.google.android.material.textfield.TextInputEditText;

public class PageConnexion extends AppCompatActivity {

    private TextInputEditText con_email, con_password;
    private Button btn_conn;
    private TextView forget_pass, btn_joint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_connexion);

        con_email= findViewById(R.id.id_conn_email);
        con_password= findViewById(R.id.id_conn_password);
        btn_conn= findViewById(R.id.connect_btn);
        forget_pass= findViewById(R.id.id_forget_password);
        btn_joint= findViewById(R.id.id_btn_joint);

        //Clique sur le boutton de se connecter
        btn_conn.setOnClickListener(v -> {
            String email= con_email.getText().toString();
            String password= con_password.getText().toString();

            if (TextUtils.isEmpty(email)){
                Toast.makeText(this, "Veuillez entrer votre email", Toast.LENGTH_SHORT).show();
            }else if (TextUtils.isEmpty(password)){
                Toast.makeText(this, "Veuillez entrer votre mot de passe", Toast.LENGTH_SHORT).show();
            }else {
                Connexion(email, password);
            }
        });

        //Clique sur le button mot de passe oublié
        forget_pass.setOnClickListener(v -> Toast.makeText(PageConnexion.this,
                "Vous avez oublier votre mot de passe",Toast.LENGTH_SHORT).show());

        //Clique sur le button créer un compte
        btn_joint.setOnClickListener(v -> startActivity(new Intent(PageConnexion.this, PageCreerCompte.class)));

    }

    //Methode pour se connecter
    private void Connexion(String email, String password) {

    }
}