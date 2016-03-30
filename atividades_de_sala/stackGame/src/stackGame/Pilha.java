package stackGame;

public class Pilha {
	private static int maxPilha = 10;
	private static int maxNum = 100;
	private static int minNum = 0;
	
	private int topo;
	private int []vet;
	private int ponto = 0;
	private int numero;
	private boolean pontuou;

	
	public int getMaxPilha() {
		return maxPilha;
	}
	
	public int getMaxNum() {
		return maxNum;
	}
	
	public int getMinNum() {
		return minNum;
	}
	
	public void crie() {
		topo = -1;
		vet = new int[maxPilha];
	}
	
	public boolean empilhe(int elem) {
		if(topo >= (maxPilha -1)) return false;
		else {
			topo++;
			vet[topo] = elem;
			return true;
		}
	}
	
	public int desempilha() {
		if(vazia()) return -1;
		else {
			numero = vet[topo];
			topo--;
			return numero;
		}
	}
	
	public int verTopo() {
		return vet[topo];
	}
	
	public boolean vazia() {
		return topo < 0;
	}
	
	public int calculaPontuacao(int num) {
		pontuou = false;
		
		while(!vazia() && !pontuou) {
			if(num == desempilha()) {
				pontuou = true;
				ponto = topo + 2;
			}
		}
		
		topo = -1;
		return ponto;
	}
}