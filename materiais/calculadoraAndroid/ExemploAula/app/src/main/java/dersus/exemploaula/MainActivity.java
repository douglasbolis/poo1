package dersus.exemploaula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criar os listenners nos botoes

        Button soma = (Button) findViewById(R.id.somaPrincipal);
        assert soma != null;
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SomaActivity.class));
            }
        });

        Button subt = (Button) findViewById(R.id.sbtPrincipal);
        assert subt != null;
        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SubtraiActivity.class));
            }
        });

    }
}
