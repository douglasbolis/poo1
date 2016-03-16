#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "entrada.h"

double entradaDeDados(String msg) {
    double el;

    printf("\n%s: ");
    scanf("%f", &el);

    return el;
}