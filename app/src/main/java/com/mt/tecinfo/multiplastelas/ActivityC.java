package com.mt.tecinfo.multiplastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        TextView txtIdade = findViewById(R.id.tx_nome);
        Button sair = findViewById(R.id.btn_fechar);

        Intent intentRecebido = getIntent();
        String idade = intentRecebido.getStringExtra("nome");

        txtIdade.setText(idade);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
