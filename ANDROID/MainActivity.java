package com.fatecsbc.firezinhozamboni;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 1) Iniciar os elementos da telinha :)
        EditText edtNome = findViewById(R.id.edtNome);
        EditText edtCurse = findViewById(R.id.edtCurso);
        Button btnSalvar = findViewById(R.id.btnSalvar);
        TextView txtLista = findViewById(R.id.txtLista);

        // 2) Evento do btnSalvar
        btnSalvar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Recuperando os valores
                String nome = edtNome.getText().toString();
                String curso = edtCurse.getText().toString();

                //Mensagem de teste
                Toast.makeText(MainActivity.this,
                            "Olá, " +nome + ", Seu Otário!",
                            Toast.LENGTH_LONG).show();

            }
        });
    }
}