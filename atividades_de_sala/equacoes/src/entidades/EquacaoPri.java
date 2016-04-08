package entidades;

public class EquacaoPri extends EquacaoSeg {
	public void resolveEquacao() {
		this.x1 = -(this.d/this.c);
	}

	public double getX1() {
	    return this.x1;
	}
}
