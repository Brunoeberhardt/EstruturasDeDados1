#include <stdio.h>

int main()
{
    int i = 10;
    float f = 10.1;
    char c ='a';
    
    int *ponteiroint = &i;
    float *ponteirofloat = &f;
    char  *ponteirochar = &c;
    
    printf("Valores antes da modificacao:\n");
    printf("%i ", *ponteiroint);
    printf("\n%f",  *ponteirofloat);
    printf("\n%c", *ponteirochar);
    
    printf("\n\n");
    
   *ponteiroint = 11;
   *ponteirofloat = 11.1;
   *ponteirochar = 'b';

    printf("Valores apos a modificacao:\n");
    printf("%i ", *ponteiroint);
    printf("\n%f",  *ponteirofloat);
    printf("\n%c", *ponteirochar);

}