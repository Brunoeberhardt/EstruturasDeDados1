#include<stdio.h>

int soma(int *a, int b){
    *a = *a + b;
}

int main(){
    int A,B;
    printf("Entre com os valores de A e B:\n");
    scanf("%i %i",&A,&B);
    
    soma(&A, B);
    printf("A soma dos dois numeros armazenas na variavel A é = %i",A);
}