package com.dblima.agendocontatos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NovoContato extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novo_contato);

        /*
        Button soma = (Button) findViewById(R.id.SomaBt);
        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText param1 = (EditText) findViewById(R.id.param1Soma);
                EditText param2 = (EditText) findViewById(R.id.param2Soma);

                int val1 = Integer.parseInt(param1.getText().toString());
                int val2 = Integer.parseInt(param2.getText().toString());

                TextView resultadoText = (TextView) findViewById(R.id.Resultado);
                int res = val1 + val2;
                resultadoText.setText(res+"");
            }
        });
        */

    }
}
