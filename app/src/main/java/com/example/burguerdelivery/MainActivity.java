package com.example.burguerdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btncriarconta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Entre ou Cadastre-se");
        telaCadastro();
    }

    public void telaCadastro(){

        btncriarconta = (Button) findViewById(R.id.btCriarConta);

        btncriarconta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela = new Intent(MainActivity.this, CadastroActivity.class);
                startActivityForResult(tela, 0);
            }
        });
    }

}
