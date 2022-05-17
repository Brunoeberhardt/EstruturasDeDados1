#include<stdio.h>

int maiorValor = 0;
int c = 0;

void verifica(int *elementos, int numElementos) {  

    int j;
    maiorValor = elementos[0];

        for(j=0; j<numElementos; j++) {  

            if(maiorValor <= elementos[j]) {
            maiorValor = elementos[j];
            }
        }

        for(j=0; j<numElementos; j++) {  

            if(maiorValor==elementos[j]) {
            c++;
            }
        }

    
}

void main (){

    int N;
    int i = 0;

    printf("Digite a quantidade de  numeros para sua lista:\n");
    scanf ("%d", &N);

    int lista[N];

    for (i = 0; i < N; i++){

       printf("\nDigite o numero %d:\n", i+1);
       scanf("%d", &lista[i]);

}

    verifica(lista, N); 

    printf("\nO maior numero digitado foi: %d\nEste numero se repetiu %d vezes\n", maiorValor, c);