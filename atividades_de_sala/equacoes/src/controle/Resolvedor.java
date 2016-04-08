package controle;

import entidades.*;
import fronteiras.*;

public class Resolvedor {
    public static void resolveEquacao() {
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

        eq.setCoeficientes(this.a, this.b, this.c, this.d);

        if (this.a != 0) {
        	eq = new EquacaoTer();

    		eq.resolveEquacao();

            if (eq.getDiscrimi <= 0) {
                Saida.equacaoTer(eq.getX1(), eq.getX2(), eq.getX3());
            } else {
                Saida.equacaoTer(eq.getX1(), eq.getX2(), eq.getX3(), eq.getX11(), eq.getX22(), eq.getX33());
            }
        } else {
        	if (this.b != 0) {
        		eq = new EquacaoSeg();

                eq.resolveEquacao();

                Saida.equacaoSeg(eq.getX1(), eq.getX2());
        	} else {
        		eq = new EquacaoPri();

                eq.resolveEquacao();

                Saida.equacaoPri(eq.getX1());
        	}
        }
    }
}