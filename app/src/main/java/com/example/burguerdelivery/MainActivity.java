package com.example.burguerdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Entre ou Cadastre-se");
    }

    public void telaCadastro(View view){
        Intent tela = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(tela);
    }

}
