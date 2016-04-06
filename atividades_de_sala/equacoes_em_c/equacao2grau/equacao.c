#include <math.h>
#include <stdio.h>
#include <stdlib.h>

#include "equacao.h"

struct eq2grau {
    double a, b, c;
    double delta, x1, x2;
};

Eq2grau* criaEq() {
    Eq2grau *eq = malloc(sizeof(Eq2grau));
    return eq;
}

double getA(Eq2grau* eq) {
    return eq->a;
}

double getB(Eq2grau* eq) {
    return eq->b;
}

double getc(Eq2grau* eq) {
    return eq->c;
}

double getDelta(Eq2grau* eq) {
    return eq->delta;
}

double getX1(Eq2grau* eq) {
    return eq->x1;
}

double getX2(Eq2grau* eq) {
    return eq->x2;
}

void setA(Eq2grau* eq, double a) {
    eq->a = a;
}

void setB(Eq2grau* eq, double b) {
    eq->b = b;
}

void setC(Eq2grau* eq, double c) {
    eq->c = c;
}

void setDelta(Eq2grau* eq, double delta) {
    eq->delta = delta;
}

void setX1(Eq2grau* eq, double x1) {
    eq->x1 = x1;
}

void setX2(Eq2grau* eq, double x2) {
    eq->x2 = x2;
}

double calculaDelta(Eq2grau* eq) {
    double a = getA(eq), b = getB(eq), c = getC(eq);

    return ((b*b) - (4*a*c));
}

void calculaRaizes(Eq2grau* eq) {
    double a = getA(eq), b = getB(eq), delta = getDelta(eq);

    setX1(eq, (-b + sqrt(delta))/(2*a));

    setX2(eq, (-b - sqrt(delta))/(2*a));

}

void freeEq2grau(Eq2grau* eq) {
    free(eq);
}