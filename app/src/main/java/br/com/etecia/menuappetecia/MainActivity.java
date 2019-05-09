package br.com.etecia.menuappetecia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Título");
        getSupportActionBar().setIcon(R.drawable.arrow_back);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.mCompartilhar:

                Toast.makeText(getApplicationContext(), "Compartilhar", Toast.LENGTH_SHORT).show();
                Intent compartilhar = new Intent(MainActivity.this,Compartilhar_Activity.class);
                startActivity(compartilhar);
                break;

            case R.id.mFavoritos:
                Toast.makeText(getApplicationContext(), "Favoritos", Toast.LENGTH_SHORT).show();
                Intent favoritos = new Intent(MainActivity.this,Favoritos_Activity.class);
                startActivity(favoritos);
                break;

            case R.id.mConfiguracoes:
                Toast.makeText(getApplicationContext(), "Configurações", Toast.LENGTH_SHORT).show();
                Intent configuracoes = new Intent(MainActivity.this,Compartilhar_Activity.class);
                startActivity(configuracoes);
                break;

            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(), "Pesquisar", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mSobre:
                Toast.makeText(getApplicationContext(), "Sobre", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mSalvos:
                Toast.makeText(getApplicationContext(), "Salvos", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);

    }
}

