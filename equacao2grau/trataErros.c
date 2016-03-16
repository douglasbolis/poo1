#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "equacao.h"

struct eq2grau {
    double a, b, c;
};

Eq2grau* criaEq() {
    Eq2grau *eq = malloc(sizeof(Eq2grau));
    eq.a = eq.b = eq.c = NULL;
    return eq;
}

void tratadorExcessoes(string msgErro) {
    printf("\n%s\n\n", msgErro);
}

double geta(Eq2grau* eq) {
    return eq.a;
}

double getb(Eq2grau* eq) {
    return eq.b;
}

double getc(Eq2grau* eq) {
    return eq.c;
}

void seta(Eq2grau* eq, double a) {
    eq.a = a;
}
void setb(Eq2grau* eq, double b) {
    eq.b = b;
}

void setc(Eq2grau* eq, double c) {
    eq.c = c;
}

double calculaDelta(Eq2grau* eq) {
    double a = geta(eq), b = getb(eq), c = getc(eq);

    return (b*b) - (4.a.c);
}

void calculaRaizes(double a, double b, double delta) {
    double x1, x2;
    
    x1 = ((-1*b)+(sqrt(delta)))/(2.a);
    x1 = ((-1*b-)(sqrt(delta)))/(2.a);
    
    return (x1, x2);
}
