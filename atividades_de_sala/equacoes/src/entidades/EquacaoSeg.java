package entidades;

public class EquacaoSeg extends EquacaoTer {
		public void resolveDiscrim() {
		    setDiscrim(Math.pow(getC(), 2) - (4*getB()*getD()));
		}

		public void resolveEquacao() {
		    setX1((-getC() + Math.sqrt(getDiscrim()))/(2*getB()));
		    setX2((-getC() - Math.sqrt(getDiscrim()))/(2*getB()));
		}
}
