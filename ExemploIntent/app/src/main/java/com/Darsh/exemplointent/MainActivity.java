package com.Darsh.exemplointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Constantes
    public static final String EXTRA_MESSAGE = "com.Darsh.exemplointent.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Chamado quando o usuário clica no botão Enviar
     * @param view O botão Eviar
     */
    public void envieMensagem(View view){
        //Faça algo em resposta ao clique do botão
        Intent intent = new Intent(this, MostreMensagemActivity.class);
        EditText editText = findViewById(R.id.editTextText);
        String mensagem = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensagem);
        startActivity(intent);

    }
}