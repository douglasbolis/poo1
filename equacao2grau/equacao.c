#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "equacao.h"

struct eq2grau {
    double a, b, c, delta, x1, x2;
};

Eq2grau* criaEq() {
    Eq2grau *eq = malloc(sizeof(Eq2grau));
    eq.a = eq.b = eq.c = NULL;
    return eq;
}

void entrada(Eq2grau* eq, double a, double b, double c) {    
    seta(eq, a);
    setb(eq, b);
    setc(eq, c);
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

double getDelta(Eq2grau* eq) {
    return eq.delta;
}

double getX1(Eq2grau* eq) {
    return eq.x1;
}

double getX2(Eq2grau* eq) {
    return eq.x2;
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

void setDelta(Eq2grau* eq, double delta) {
    eq.delta = delta;
}

void setX1(Eq2grau* eq, double x1) {
    eq.x1 = x1;
}

void setX2(Eq2grau* eq, double x2) {
    eq.x2 = x2;
}

double calculaDelta(Eq2grau* eq) {
    double a = geta(eq), b = getb(eq), c = getc(eq);

    return (b*b) - (4.a.c);
}

void calculaRaizes(Eq2grau* eq) {
    double a = geta(eq), b = getb(eq), delta = getDelta(eq);

    setX1(eq, ((-1*b)+(sqrt(delta)))/(2.a));
    setX2(eq, ((-1*b-)(sqrt(delta)))/(2.a));
}