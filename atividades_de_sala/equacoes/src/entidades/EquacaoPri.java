package entidades;

public class EquacaoPri extends EquacaoSeg {
	public void resolveEquacao() {
		setX1(-(getD()/getC()));
	}
}
