package com.darsh.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    //Constantes usadas ao se salvar/restaurar estado do app:
    private static final String CONTA = "CONTA";
    private static final String PERCENTUAL = "PERCENTUAL";

    //Atributos que armazernam os valores que devem ser mantidos
    //quando o plaicativo reincio:
    private  double conta;
    private double percentual;

    //Armazena as referências aos composnentes da interface gráfica.
    private EditText contaEditText;
    private EditText gorjeta5EditText;
    private EditText gorjeta10EditText;
    private EditText gorjeta15EditText;
    private SeekBar percentualSeekBar;
    private EditText percentualEditText;
    private EditText gorjetaEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtém referencias aos componentes da tela:
        contaEditText = (EditText) findViewById(R.id.contaEditText);
        gorjeta5EditText = (EditText) findViewById(R.id.gorjeta5EditText);
        gorjeta10EditText = (EditText) findViewById(R.id.gorjeta10EditText);
        gorjeta15EditText = (EditText) findViewById(R.id.gorjeta15EditText);
        percentualSeekBar = (SeekBar) findViewById(R.id.percentualSeekBar);
        percentualEditText = (EditText) findViewById(R.id.percentualEditText);
        gorjetaEditText = (EditText) findViewById(R.id.gorjetaEditText);
    }
}