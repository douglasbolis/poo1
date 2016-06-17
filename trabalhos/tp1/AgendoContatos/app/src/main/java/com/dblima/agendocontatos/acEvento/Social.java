package com.dblima.agendocontatos.acEvento;

import acContato.Amigo;
import acContato.Contato;

public class Social extends Evento {
	private String pico;

	public String getPico() {
			return pico;
	}

	public void setPico(String pico) {
			this.pico = pico;
	}
	public void insereContatos(Contato c[], int nc){
		int i;
		for(i=0;i<nc;i++){
			if (c[i] instanceof Amigo){
				this.insereContato(i);
			}
		}
	}
}
