package com.dblima.agendocontatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Criar os listenners nos botoes

        Button btNovoContato = (Button) findViewById(R.id.mainBtNovoContato);
        assert btNovoContato != null;
        btNovoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NovoContato.class));
            }
        });

        btNovoContato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent addContatoIntent;
                addContatoIntent = new Intent(MainActivity.this, NovoContato.class);
                addContatoIntent.putExtra("Option", NovoContato.ADD);
                startActivity(addContatoIntent);
            }
        });

        Button btNovoEnento = (Button) findViewById(R.id.mainBtNovoEvento);
        assert btNovoEnento != null;
        btNovoEnento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),NovoEvento.class));
            }
        });
    }
}
