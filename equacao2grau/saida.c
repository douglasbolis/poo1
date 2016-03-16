#include <stdio.h>
#include <stdlib.h>
#include "saida.h"

void saida(Eq2grau* eq) {
    printf("\nAs raizes sao X1: %.1f e X2: %.1f\n\n", getX1(eq), getX2(eq));
}