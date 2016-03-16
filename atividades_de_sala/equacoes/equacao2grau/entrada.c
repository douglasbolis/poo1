#include <stdio.h>
#include <stdlib.h>

#include "entrada.h"

double leCoeficiente(char *msg) {
    double el;

    printf("\n%s: ", msg);
    scanf("%lf", &el);

    return el;
}