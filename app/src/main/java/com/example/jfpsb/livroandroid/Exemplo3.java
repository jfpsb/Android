package com.example.jfpsb.livroandroid;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Exemplo3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo3);

        Button btnNome = (Button) findViewById(R.id.btnNome);
        final EditText txtNome = (EditText) findViewById(R.id.txtNome);
        final TextView lblResultado = (TextView) findViewById(R.id.lblResultado);

        btnNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = txtNome.getText().toString();
                lblResultado.setText("Obrigado, " + nome);
            }
        });

    }
}
