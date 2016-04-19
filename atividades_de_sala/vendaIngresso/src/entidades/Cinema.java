package entidades;

public class Cinema extends Local {
	private static int numCadeirasEspeciais;
	private static int numCadeirasSimples;

	public Cinema(int simples, int especiais) {
			numCadeirasSimples = simples;
			numCadeirasEspeciais = especiais;
	}

	public int getNumCadeirasEspeciais() {
		return this.numCadeirasEspeciais;
	}

	public int getNumCadeirasSimples() {
		return this.numCadeirasSimples;
	}

	public int getCapacidadeTotal() {
		return numCadeirasSimples+numCadeirasEspeciais;
	}
}
