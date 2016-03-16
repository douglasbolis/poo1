#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "equacao.h"

void resolveEq2Grau() {
    Eq2grau *eq = criaEq();
    
    while(eq.a == NULL || eq.b == NULL || eq.c == NULL) {
        if (eq.a == NULL) 
            seta(eq, entradaDeDados("Digite um valor para A"));
        else if (eq.b == NULL) 
            setb(eq, entradaDeDados("Digite um valor para B"));
        else 
            setc(eq, entradaDeDados("Digite um valor para C"));
    }

    setDelta(eq, calculaDelta(eq));

    if (getDelta(eq) < 0)

    else {
        calculaRaizes(eq);
        saida(eq);
    }
}