package com.dblima.agendocontatos;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class NovoContato extends Activity {
    // As variáveis estáticas são para saber: quando a activity é acessada
    // se é para um novo contato ou se é para editar um contato
    public static String EDIT="Editar", ADD="Adicionar";

//    private Contato contatoForEdit;

    private int selectGenero = 0, selectProximidade = 0;

//    Data dtNascimento;

    private Calendar myCalendar;

    private DatePickerDialog.OnDateSetListener date;

    private Button btSalvar, btCancelar;
    private EditText nome, email, celular, dataNasc, cep, rua, numero, bairro, cidade;
    private Spinner genero, proximidade;
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

        definindoAsVariaveisDeNovoContato();

        // Captura uma instância de calendário.
        NovoContato.this.myCalendar = Calendar.getInstance();

        /*dataNasc = new Data(Calendar.getInstance().get(Calendar.YEAR),
                    Calendar.getInstance().get(Calendar.MONTH) + 1,
                    Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        }*/

    }

    @Override
    public void onStart() {
        super.onStart();

    // Chamando os métodos ao iniciar a tela de cadastro
        defineCalendarioParaTiposData();
        preencheGenero();
        verificaGenero();
        preencheProximidade();
        verificaProximidade();
        verificaAmigo();
        verificaFamiliar();
        verificaColega();
        verificaBtSalvar();
        verificaBtCancelar();
    }

    public void definindoAsVariaveisDeNovoContato() {
        NovoContato.this.btSalvar = (Button) findViewById(R.id.novoContatoSalvar);
        NovoContato.this.btCancelar = (Button) findViewById(R.id.novoContatoCancelar);

        NovoContato.this.nome = (EditText) findViewById(R.id.novoContatoNome);
        NovoContato.this.email = (EditText) findViewById(R.id.novoContatoEmail);
        NovoContato.this.celular = (EditText) findViewById(R.id.novoContatoCelular);
        NovoContato.this.cep = (EditText) findViewById(R.id.novoContatoCep);
        NovoContato.this.dataNasc = (EditText) findViewById(R.id.novoContatoDataNasc);
        NovoContato.this.genero = (Spinner) findViewById(R.id.novoContatoGenero);
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

    // Define para os campos tipo data um calendário para facilitar o preenchimento
    private void defineCalendarioParaTiposData() {
        date = new DatePickerDialog.OnDateSetListener() {
    // onDataSet insere uma data nos campos que a chamou.
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

                dtNascimento = new Data(year, monthOfYear+1, dayOfMonth);

    // insere no campo da data de nascimento o data escolhida
                dataNasc.setText(new SimpleDateFormat("dd/MM/yyyy", new Locale("pt","BR")).format(myCalendar.getTime()));

            }
        };

    // Verifica se o campo de data recebe foco
    // se sim, abre um diálogo para a escolha da data
        dataNasc.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    new DatePickerDialog(NovoContato.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
            }

        });

        dataNasc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                new DatePickerDialog(NovoContato.this, date, myCalendar
                    .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                    myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });
    }

    // Aqui spinner de gênero é preenchido
    private void preencheGenero() {
        String[] spinnerGenero = getResources().getStringArray(R.array.opcoes_genero);

    // Preenchendo o spinner do gênero
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, spinnerGenero);

        assert genero != null;
        genero.setAdapter(adapter);
    }

    // Aqui verifica se ouve uma mudança na opção de gênero
    private void verificaGenero() {
        genero.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                selectGenero = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {}
        });
    }

    // Aqui spinner de nível de proximidade do contato é preenchido
    private void preencheProximidade() {
        String[] spinnerProximidade = getResources().getStringArray(R.array.opcoes_proximidade);

    // Preenchendo o spinner de proximidade
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, spinnerProximidade);

        assert proximidade != null;
        proximidade.setAdapter(adapter);// Popula o dropdown com as opções.
    }

    // Aqui verifica se ouve uma mudança na opção d proximidade
    private void verificaProximidade() {
        proximidade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
                selectProximidade = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {}
        });
    }

    // Se o checkbox de amigo for selecionado um LinearLayout é mostrado
    private void verificaAmigo() {
        relacaoAmigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                LinearLayout layoutAmigo = (LinearLayout) findViewById(R.id.novoContatoLayoutReferenciaRelacaoAmigo);
            // Abaixo deixa o LinearLayout visível ou não
                if (relacaoAmigo.isChecked()) {
                    assert layoutAmigo != null;
                    layoutAmigo.setVisibility(LinearLayout.VISIBLE);
                } else {
                    assert layoutAmigo != null;
                    layoutAmigo.setVisibility(LinearLayout.GONE);
                }
            }
        });
    }

    // Aqui se o checkbox de familiar for selecionado um LinearLayout é mostrado
    private void verificaFamiliar() {
        relacaoFamiliar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                LinearLayout layoutFamiliar = (LinearLayout) findViewById(R.id.novoContatoLayoutReferenciaRelacaoFamiliar);
                // Abaixo deixa o LinearLayout visível ou não
                if (relacaoFamiliar.isChecked()) {
                    assert layoutFamiliar != null;
                    layoutFamiliar.setVisibility(LinearLayout.VISIBLE);
                } else {
                    assert layoutFamiliar != null;
                    layoutFamiliar.setVisibility(LinearLayout.GONE);
                }
            }
        });
    }

    // Aqui se o checkbox de colega for selecionado um LinearLayout é mostrado
    private void verificaColega() {
        relacaoColega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                LinearLayout referenciaColega = (LinearLayout) findViewById(R.id.novoContatoLayoutReferenciaRelacaoColega);
                LinearLayout localColega = (LinearLayout) findViewById(R.id.novoContatoLayoutLocalRelacaoColega);
                LinearLayout profissaoColega = (LinearLayout) findViewById(R.id.novoContatoLayoutProfissaoRelacaoColega);

            // Verificando se relação com colega foi selecionado
            // e deixando o LinearLayout visível ou não
                if (relacaoColega.isChecked()) {
                    assert referenciaColega != null;
                    referenciaColega.setVisibility(LinearLayout.VISIBLE);

                    assert localColega != null;
                    localColega.setVisibility(LinearLayout.VISIBLE);

                    assert profissaoColega != null;
                    profissaoColega.setVisibility(LinearLayout.VISIBLE);
                } else {
                    assert referenciaColega != null;
                    referenciaColega.setVisibility(LinearLayout.GONE);

                    assert localColega != null;
                    localColega.setVisibility(LinearLayout.GONE);

                    assert profissaoColega != null;
                    profissaoColega.setVisibility(LinearLayout.GONE);
                }
            }
        });
    }

    // Verifica se o botão de salvar contato foi clicado
    private void verificaBtSalvar() {
        assert btSalvar != null;
        btSalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                salvarContato();
                finish();
            }
        });
    }

    // Verifica se o botão de cancelar cadastro do contato foi clicado
    private void verificaBtCancelar() {
        assert btCancelar!= null;
        btCancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
