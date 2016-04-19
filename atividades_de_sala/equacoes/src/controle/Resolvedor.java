package controle;

import entidades.*;
import fronteira.*;

public class Resolvedor {
    public static void resolveEquacao() {
        EquacaoTer eq;
        Double a, b, c, d;

        System.out.print("Digite o valor de a: ");
        a = Entrada.leCoeficiente();

        System.out.print("Digite o valor de b: ");
        b = Entrada.leCoeficiente();

        System.out.print("Digite o valor de c: ");
        c = Entrada.leCoeficiente();

        System.out.print("Digite o valor de d: ");
        d = Entrada.leCoeficiente();

        if (a != 0) {
          	eq = new EquacaoTer();
            eq.setCoeficientes(a, b, c, d);

            eq.resolveDiscrim();
            eq.resolveEquacao();

            if (eq.getDiscrim() <= 0) {
                Saida.equacaoTer(eq.getX1(), eq.getX2(), eq.getX3());
            } else {
                Saida.equacaoTer(eq.getX1(), eq.getX2(), eq.getX3(), eq.getX11(), eq.getX22(), eq.getX33());
            }
        } else {
        	if (b != 0) {
            		eq = new EquacaoSeg();
                eq.setCoeficientes(a, b, c, d);

                eq.resolveDiscrim();

                if (eq.getDiscrim() < 0) {
                    TrataErros.msgErro("A equação não possui raízes reais.");
                } else {
                    eq.resolveEquacao();
                    Saida.equacaoSeg(eq.getX1(), eq.getX2());
                }
        	} else {
                if (c != 0){
          		      eq = new EquacaoPri();
                    eq.setCoeficientes(a, b, c, d);

                    eq.resolveEquacao();

                    Saida.equacaoPri(eq.getX1());
                } else {
                    TrataErros.msgErro("Os coeficientes inseridos não formam uma equação.");
                }
        	}
        }
    }
}
