#ifndef EQUACAO_H
#define	EQUACAO_H

typedef struct eq2grau Eq2grau;

Eq2grau* criaEq();

void entrada(double, double, double);
void saida(Eq2grau*);

double geta(Eq2grau*);
double getb(Eq2grau*);
double getc(Eq2grau*);

void seta(Eq2grau*, double);
void setb(Eq2grau*, double);
void setc(Eq2grau*, double);

double calculaDelta(Eq2grau*);

#endif	/* EQUACAO_H */
