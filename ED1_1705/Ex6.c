#include <stdio.h>

int main()     
{
    int a=10, b=11, c=0; 
        printf("\nvalor A: %i", a);
        printf("\nvalor B: %i", b);  

    
    calculo(a,b,c); 
    return 0;
}
int calculo(a,b,c){
    a =a*2;
    b =b*2;
    c=a+b;
    printf("\n\ndobro de a: %d \ndobro de b: %d \nsoma dos dobros: %d",a,b,c);
    return 0;
}