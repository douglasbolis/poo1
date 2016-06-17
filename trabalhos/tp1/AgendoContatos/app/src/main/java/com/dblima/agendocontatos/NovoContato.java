package com.dblima.agendocontatos;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class NovoContato extends Activity {
    // As variáveis estáticas são para saber: quando a activity é acessada
    // se é para um novo contato ou se é para editar um contato
    public static String EDIT="Editar", ADD="Adicionar";

//    private Contato contatoForEdit;

    private int optProximidade = 0;

//    Data dtNascimento;

    private Calendar myCalendar;

    private DatePickerDialog.OnDateSetListener date;

    private Button btSalvar, btCancelar;
    private EditText nome, email, celular, dataNasc, cep, rua, numero, bairro, cidade;
    private RadioButton generoF, generoM;
    private Spinner proximidade;
    private CheckBox relacaoAmigo, relacaoColega, relacaoFamiliar;
    private EditText referenciaRelacaoAmigo, referenciaRelacaoColega, referenciaRelacaoFamiliar,
            profissaoRelacaoColega, localRelacaoColega;

    // Métodos da Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novo_contato);

        /*EditText celular = (EditText) findViewById(R.id.novoContatoCelular);
        celular.addTextChangedListener(new PhoneNumberFormattingTextWatcher("BR"));*/

        definindoQuemEhQuem();

        // Captura uma instância de calendário.
        NovoContato.this.myCalendar = Calendar.getInstance();

        /*dataNasc = new Data(Calendar.getInstance().get(Calendar.YEAR),
                    Calendar.getInstance().get(Calendar.MONTH) + 1,
                    Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        }*/

    }

    public void definindoQuemEhQuem() {
        NovoContato.this.btSalvar = (Button) findViewById(R.id.novoContatoSalvar);
        NovoContato.this.btCancelar = (Button) findViewById(R.id.novoContatoCancelar);

        NovoContato.this.nome = (EditText) findViewById(R.id.novoContatoNome);
        NovoContato.this.email = (EditText) findViewById(R.id.novoContatoEmail);
        NovoContato.this.celular = (EditText) findViewById(R.id.novoContatoCelular);
        NovoContato.this.cep = (EditText) findViewById(R.id.novoContatoCep);
        NovoContato.this.dataNasc = (EditText) findViewById(R.id.novoContatoDataNasc);
        NovoContato.this.generoF = (RadioButton) findViewById(R.id.novoContatoGeneroF);
        NovoContato.this.generoM = (RadioButton) findViewById(R.id.novoContatoGeneroM);
        NovoContato.this.rua = (EditText) findViewById(R.id.novoContatoRua);
        NovoContato.this.numero = (EditText) findViewById(R.id.novoContatoNumero);
        NovoContato.this.bairro = (EditText) findViewById(R.id.novoContatoBairro);
        NovoContato.this.cidade = (EditText) findViewById(R.id.novoContatoCidade);

        NovoContato.this.referenciaRelacaoAmigo = (EditText) findViewById(R.id.novoContatoLayoutValueReferenciaRelacaoAmigo);
        NovoContato.this.referenciaRelacaoFamiliar = (EditText) findViewById(R.id.novoContatoLayoutValueReferenciaRelacaoFamiliar);
        NovoContato.this.referenciaRelacaoColega = (EditText) findViewById(R.id.novoContatoLayoutValueReferenciaRelacaoColega);
        NovoContato.this.profissaoRelacaoColega = (EditText) findViewById(R.id.novoContatoLayoutValueProfissaoRelacaoColega);
        NovoContato.this.localRelacaoColega = (EditText) findViewById(R.id.novoContatoLayoutValueLocalRelacaoColega);

        NovoContato.this.proximidade = (Spinner) findViewById(R.id.novoContatoNivelProximidade);

        NovoContato.this.relacaoAmigo = (CheckBox) findViewById(R.id.novoContatoCkRelacaoAmigo);
        NovoContato.this.relacaoColega = (CheckBox) findViewById(R.id.novoContatoCkRelacaoColega);
        NovoContato.this.relacaoFamiliar = (CheckBox) findViewById(R.id.novoContatoCkRelacaoFamiliar);
    }
}
