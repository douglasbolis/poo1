package acEvento;
import acCommon.Endereco;
import acCommon.acEnum.Exclusividade;
import acContato.Contato;

import java.util.Date;

public class Evento extends Endereco {
    private String titulo;
    private String local;
    private Date data;
    private Exclusividade exclusividade;
    private int maxConvidados;
    private Float valor;

    // TOdo avaliar como contatos serma armazenados
    private int contatos[] = new int[100];
    private int nc=0;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void insereContato(int c){
        contatos[nc]=c;
        nc++;
    }

    public void insereContatos(Contato c[]){

    }
}
