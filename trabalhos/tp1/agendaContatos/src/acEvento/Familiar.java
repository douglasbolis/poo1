package acEvento;

import acCommon.acEnum.EventoFamiliar;
import acContato.Contato;
import acContato.Familia;

public class Familiar extends Evento {
    private EventoFamiliar tipoEvento;

    public void insereContatos(Contato c[], int nc){
        int i;
        for(i=0;i<nc;i++){
            if (c[i] instanceof Familia){
                this.insereContato(i);
            }
        }
    }
}
