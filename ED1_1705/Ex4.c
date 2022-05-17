void troca(int *i1, int *i2){
    int aux;
    aux = *i1;
    *i1 = *i2;
    *i2 = aux;
}

int main(){
    int A = 10, B= 15;
    printf("Antes da modificacao:\n");
    printf("A: %d\tB: %d\n", A, B);
    troca(&A, &B);
    printf("Depois da modificacao:\n");
    printf("A: %d\tB: %d\n", A, B);

    return 0;
}