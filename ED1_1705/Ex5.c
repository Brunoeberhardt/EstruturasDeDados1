#include <stdio.h>

int compara(int *i1, int *i2){

int aux;

   if(*i2 > *i1) {
       aux = *i2;
       *i2 = *i1;
       *i1 = aux;
   }
}
int main(){

   int nro1, nro2;
  
   printf("Entre com o valor 1: ");
   scanf("%d", &nro1);

   printf("Entre com o valor 2: ");
   scanf("%d", &nro2);

   compara(&nro1,&nro2);
 
   printf("\nMaior valor digitado: %d",nro1);
   printf("\nMenor valor digitado: %d",nro2);
 
   return 0;
}