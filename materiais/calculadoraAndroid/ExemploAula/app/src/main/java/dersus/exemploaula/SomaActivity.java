package dersus.exemploaula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by joãocarlos on 25/05/2016.
 */
public class SomaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soma_activity);

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


    }
}
