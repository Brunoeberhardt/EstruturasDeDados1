#include <stdio.h>
#include <stdlib.h>

int main (void) {
	int i;
	float vetor[10];
	float *pos;
	pos = vetor;

	for (i = 0; i < 10; i++) { 
	
	}
	for (i = 0; i < 10; i++) {
        printf("Endereco: %p da Posiçao: %d\n", vetor + i, *(vetor + i));
	}
	return 0;
}