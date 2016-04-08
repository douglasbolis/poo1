package controle;

import entidades.*;
import fronteiras./;

public class Resolvedor {
	private EquacaoTer eq;
	private double a, b, c, d;

    System.out.print("Digite o valor de a: ");
    this.a = leCoeficiente();

    System.out.print("Digite o valor de b: ");
    this.b = leCoeficiente();

    System.out.print("Digite o valor de c: ");
    this.c = leCoeficiente();

    System.out.print("Digite o valor de d: ");
    this.d = leCoeficiente();

    if (this.a != 0) {
    	eq = new Equacaoter();

		eq.setCoeficientes(this.a, this.b, this.c, this.d);
		eq.resolveDiscrim();

		eq.resolveEquacao();
		
		Saida.imprimeResultadoEquacaoThree(eq.getX1Real(), eq.getX2Real(), eq.getX3Real(), eq.getX1Img(), eq.getX2Img(), eq.getX3Img());
    } else {
    	if (this.b != 0) {
    		eq = new EquacaoSeg();
    	} else {
    		eq = new EquacaoPri();
    	}
    }
}