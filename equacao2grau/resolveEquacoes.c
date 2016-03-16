#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#include "resolveEquacoes.h"

void resolveEq2Grau() {
    Eq2grau *eq = criaEq();
    
    setA(eq, leCoeficiente("Digite um valor para A"));
    setB(eq, leCoeficiente("Digite um valor para B"));
    setC(eq, leCoeficiente("Digite um valor para C"));

    setDelta(eq, calculaDelta(eq));

    if (getDelta(eq) < 0)
        msgErro("Não possui raízes reais ou soluções reais, pois o valor do discriminante é menor que zero.");
    else {
        calculaRaizes(eq);
        saida(eq);
    }

    freeEq2grau(eq);
}