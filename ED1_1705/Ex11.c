#include <stdio.h>
#include <stdlib.h>

int main (){
    
int vetor[5], i;
int *endereco;

endereco = vetor;

printf("Entre com os elementos\n");
for(i = 0; i < 5; i++){
printf("%d: ",i+1);
scanf("%d", &vetor[i]);

}

printf("\nEnderecos dos arrays pares:\n");
endereco = vetor;
for(i = 0; i < 5; i++){
if(vetor[i] %2 == 0){
printf("\n%d  -->  Posicao = %d", vetor[i], endereco);
}
endereco++;
}
}