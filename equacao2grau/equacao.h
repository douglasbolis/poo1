#ifndef EQUACAO_H
#define	EQUACAO_H

typedef struct eq2grau Eq2grau;

Eq2grau* criaEq();

void entrada(double, double, double);
void saida(Eq2grau*);

double getA(Eq2grau*);
double getB(Eq2grau*);
double getC(Eq2grau*);

double getDelta(Eq2grau*);
double getX1(Eq2grau*);
double getX2(Eq2grau*);

void setA(Eq2grau*, double);
void setB(Eq2grau*, double);
void setC(Eq2grau*, double);

void setDelta(Eq2grau*, double);
void setX1(Eq2grau*, double);
void setX2(Eq2grau*, double);

double calculaDelta(Eq2grau*);

#endif	/* EQUACAO_H */
