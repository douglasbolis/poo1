package com.dblima.agendocontatos.acEvento;

import acCommon.acEnum.EventoProfissional;
import acContato.Colega;
import acContato.Contato;

public class Profissional extends Evento {
    private EventoProfissional tipoEvento;

    public void insereContatos(Contato c[], int nc){
        int i;
        for(i=0;i<nc;i++){
            if (c[i] instanceof Colega){
                this.insereContato(i);
            }
        }
    }
}
