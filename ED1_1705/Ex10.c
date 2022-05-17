#include <stdio.h>

int main() {
    
    int valor[5];
    int *valorPonteiro = valor; 

    for(int i = 0; i < 5; ++i) {
    
    printf("Insira um valor: ");
    scanf("%d", valorPonteiro);
    
    ++valorPonteiro;
    }
    
    valorPonteiro = valor;
    
    for(int i = 0; i < 5; ++i) {
    
        printf("%d\n", (*valorPonteiro) * 2);
    
        ++valorPonteiro;
        
    }

    return 0;
}