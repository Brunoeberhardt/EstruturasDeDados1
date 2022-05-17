#include <stdio.h>

int main() {
	int A;
	int *B = &A;   
	int **C = &B;  
	int ***D = &C; 
	
	printf("\nInsira um valor: ");
	scanf("%d", &A);
	
	printf("\nDobro: %d", (*B * 2));
	printf("\nTriplo: %d", (**C * 3));
	printf("\nQuadruplo: %d", (***D * 4)); 
	
	return 0;
}