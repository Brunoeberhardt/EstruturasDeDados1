#include <stdio.h>

int main() {
    
	float matriz[3][3] = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
	int i, j;
	
	printf("Endereço das posicoes de uma matriz [3][3]:\n\n");
	for (i=0; i<3; i++) {
		for (j=0; j<3; j++)
			printf("%p\n", &matriz[i][j]);
	}	
	
	return 0;
}