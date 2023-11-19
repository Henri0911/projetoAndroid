package com.darsh.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class esqueciActivity extends AppCompatActivity {

    private EditText campoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci);

        inicializaComponente();


        Button botaoRecuperar = findViewById(R.id.botaoRecuperar);
        botaoRecuperar.setOnClickListener(new View.OnClickListener() {

            //tratamento de erro preecha campo
            @Override
            public void onClick(View v) {

                String email = campoEmail.getText().toString();

                if(!email.isEmpty()){
                    Toast.makeText(esqueciActivity.this, "Senha enviada para o seu E-mail!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(esqueciActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(esqueciActivity.this, "Preencha o E-mail!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button botaoVoltar = findViewById(R.id.botaoVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(esqueciActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inicializaComponente(){
        campoEmail = findViewById(R.id.editEmail);
    }
}