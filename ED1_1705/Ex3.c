#include <stdio.h>

int main () {

   int i1;
   int i2;

   printf("Entre com um valor para x: ");
   scanf("%d", &i1);

   printf("Entre com um valor para y: ");
   scanf("%d", &i2);

   printf("\n");

   if (&i1 > &i2) {
       printf("%d Tem o maior endereço da memoria", i1);
   } else {
       printf("%d Tem o maior endereço da memoria", i2);

   }

}