package entidade;

public class Reuni�o extends Evento {
private String sala;

public String getSala() {
	return sala;
}

public void setSala(String sala) {
	this.sala = sala;
}
public void insereContatos(Contato c[], int nc){
	   int i;
	   for(i=0;i<nc;i++){
		   if (c[i] instanceof Colega ){
			   this.insereContato(i);
		   }
	   }
	}
}
