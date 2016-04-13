package entidades;

public class Teatro extends Local {
	private static int numCadeirasEspeciais;
	private static int numCadeirasSimples;

	public Teatro(int simples, int especiais) {
		numCadeirasEspeciais = especiais;
		numCadeirasSimples = simples;
	}


	public int getNumCadeirasEspeciais() {
		return numCadeirasEspeciais;
	}

	public int getNumCadeirasSimples() {
		return numCadeirasSimples;
	}
	
}