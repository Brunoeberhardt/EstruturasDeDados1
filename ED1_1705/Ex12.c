#include <stdio.h>

int main(void)
{
    int A,B,C,d;
    
    printf("\n Digite os valores: \n");
    
    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%d", &C);

    printf("\n Ordem crescente / 1 para todos iguais: / 0 para valores diferetes \n");
    
    org(A,B,C);

    return 0;
}
int org(int A,int B,int C){

    if(A<B && B<C){
    printf("%d %d %d \n0", A, B, C);
    }else if(B<A && A<C){
    printf("%d %d %d \n0", B, A, C);
    }else if(B<C && C<A){
    printf("%d %d %d \n0", B, C, A);
    }else if(A<C && C<B){
    printf("%d %d %d \n0", A, C, B);
    }else if(C<A && A<B){
    printf("%d %d %d \n", C, A, B);
    }else if(A==B && C==B){
    printf("1");
    }
}