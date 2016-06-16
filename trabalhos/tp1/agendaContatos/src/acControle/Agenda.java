package acControle;

import acContato.Contato;
import acEvento.Familiar;
import acEvento.Social;
import acEvento.Evento;
import acEvento.Profissional;

public class Agenda {
		public  static final int maxc=100;
		public  static final int maxe = 20;
		private Evento eventos[];
		private int neventos;
		private Contato contatos[];
		private int ncontatos;

		public Agenda(){
				eventos = new Evento[maxe];
				neventos = 0;
				contatos = new Contato[maxc];
				ncontatos = 0;
		}

		public void criarEvento(Evento e){
				int op;
				System.out.print("Almoço (1), Reunião (2) ou Social (3)? ");
				op = system.InputHandler.readInt();

				if (op == 1){
						eventos[neventos]= new Familiar();

				} else if (op == 2) {
						eventos[neventos]= new Profissional();

				}else if(op == 3){
						eventos[neventos]= new Social();
				}

				eventos[neventos].insereContatos(this.contatos);
				neventos++;
		}

		public void criarContato(Contato c){
				// todo
				this.ncontatos++;
		}
}
