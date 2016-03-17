//
// Created by douglas on 16/03/16.
//
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main() {
    int a, b, c;

    printf("\nA: ");
    scanf("%d", &a);

    printf("\nB: ");
    scanf("%d", &b);

    printf("\nC: ");
    scanf("%d", &c);

    int delta = (b*b) - (4*a*c);

    float x1 = (-b + (sqrt(delta)))/(2*a);
    float x2 = (-b - (sqrt(delta)))/(2*a);

    printf("\nRaize: x' = %.1f e x\" = %.1f\n", x1, x2);


    return 0;
}