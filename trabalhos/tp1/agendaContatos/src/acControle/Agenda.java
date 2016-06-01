package acControle;

import acContato.Contato;
import acEvento.Almoco;
import acEvento.Balada;
import acEvento.Evento;
import acEvento.Reuniao;

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
				System.out.print("Almoço (1), Reunião (2) ou Balada (3)? ");
				op = system.InputHandler.readInt();

				if (op == 1){
						eventos[neventos]= new Almoco();

				} else if (op == 2) {
						eventos[neventos]= new Reuniao();

				}else if(op == 3){
						eventos[neventos]= new Balada();
				}

				eventos[neventos].insereContatos(this.contatos);
				neventos++;
		}

		public void criarContato(Contato c){
				// todo
				this.ncontatos++;
		}
}
