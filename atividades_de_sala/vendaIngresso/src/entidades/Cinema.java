package entidades;

public class Cinema extends Local {
	private static int numCadeirasCamarote = 10;
	private static int numCadeirasEspeciais = 20;
	private static int numCadeirasSimples = 40;


	public int getNumCadeirasCamarote() {
		return this.numCadeirasCamarote;
	}

	public int getNumCadeirasEspeciais() {
		return this.numCadeirasEspeciais;
	}

	public int getNumCadeirasSimples() {
		return this.numCadeirasSimples;
	}

	public int getCapacidadeTotal() {
		return numCadeirasSimples+numCadeirasEspeciais+numCadeirasCamarote;
	}
}