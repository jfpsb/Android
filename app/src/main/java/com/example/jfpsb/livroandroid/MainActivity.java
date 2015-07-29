package com.example.jfpsb.livroandroid;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private static final String CATEGORIA = "livro";
    private static final String[] lista = new String[] {"Flemis 1", "Flemis 2", "Flemis 3", "Flemis 4", "Flemis 5", "Sair"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter<String> listaAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        this.setListAdapter(listaAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                iniciaAct(position, Exemplo1.class);
                break;
            case 1:
                iniciaAct(position, Exemplo2.class);
                break;
            case 2:
                iniciaAct(position, Exemplo3.class);
                break;
            case 3:
                iniciaAct(position, Exemplo4.class);
                break;
            case 4:
                iniciaAct(position, Exemplo5.class);
                break;
            default:
                finish();
        }
    }

    private void iniciaAct(int position, Class classe) {
        Intent it = new Intent(this, classe);
        startActivity(it);
        toaster(position);
    }

    private void toaster(int position) {
        Object o = this.getListAdapter().getItem(position);
        String item = o.toString();
        Toast.makeText(this, "Você escolheu " + item, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
