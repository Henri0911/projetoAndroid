package com.darsh.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cadastroActivity extends AppCompatActivity {

    private EditText campoNome, campoIdade, campoCpf, campoEndereco, campoEmail, campoSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        inicializaComponentes();

        Button botaoCadastroConfirmado = findViewById(R.id.botaoCadastroConfirmado);
        botaoCadastroConfirmado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = campoNome.getText().toString();
                String idade = campoIdade.getText().toString();
                String cpf = campoCpf.getText().toString();
                String endereco = campoEndereco.getText().toString();
                String email = campoEmail.getText().toString();
                String senha = campoSenha.getText().toString();

                if ( !nome.isEmpty() ){
                    if ( !idade.isEmpty() ){
                        if ( !cpf.isEmpty() ){
                            if ( !endereco.isEmpty() ){
                                if ( !email.isEmpty() ){
                                    if ( !senha.isEmpty() ){
                                        Toast.makeText(cadastroActivity.this, "Cadastro efetuado com sucesso!", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(cadastroActivity.this, MainActivity.class);
                                        startActivity(intent);
                                    }
                                    else{
                                        Toast.makeText(cadastroActivity.this, "Preencha senha!", Toast.LENGTH_SHORT).show();
                                    }
                                }
                                else {
                                    Toast.makeText(cadastroActivity.this, "Preencha E-mail!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else {
                                Toast.makeText(cadastroActivity.this, "Preencha endereço!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(cadastroActivity.this, "Preencha cpf!", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(cadastroActivity.this, "Preencha idade!", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(cadastroActivity.this, "Preencha nome!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button botaoVoltarCadastro = findViewById(R.id.botaoVoltarCadastro);
        botaoVoltarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cadastroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void inicializaComponentes(){
        campoNome = findViewById(R.id.editNomeCadastro);
        campoIdade = findViewById(R.id.editIdadeCadastro);
        campoCpf = findViewById(R.id.editCpfCadastro);
        campoEndereco = findViewById(R.id.editEnderecoCadastro);
        campoEmail = findViewById(R.id.editEmailCadastro);
        campoSenha = findViewById(R.id.editSenhaCadastro);
    }

}