#include <stdio.h>

void fracc(float num, int *x, float *y) {
    *x = (int)num;
    *y = num - *x;
    num = 9999999;
}

int main(){
    float num, frac = 10; 
    int inteira = 10 ; 

    printf("Entre com um numero:");
    scanf("%f", &num);
    
    fracc(num, &inteira, &frac);
    
    printf("Inteiro e fracao do numero: %.2f: %i // %.2f\n", num, inteira, frac);

    return 0;
}