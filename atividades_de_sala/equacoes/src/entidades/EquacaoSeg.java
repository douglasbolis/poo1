package entidades;

public class EquacaoSeg extends EquacaoTer {
	public void resolveDiscrim() {
	    this.discrim = (Math.pow(this.b, 2) - (4*this.a*this.c));
	}

	public void resolveEquacao() {
	    this.x1 = (-this.b + Math.sqrt(this.discrim))/(2*this.a));
	    this.x2 = (-this.b - Math.sqrt(this.discrim))/(2*this.a));
	}

	public double getDiscrim() {
	    return this.discrim;
	}

	public double getX1() {
	    return this.x1;
	}

	public double getX2() {
	    return this.x2;
	}
}