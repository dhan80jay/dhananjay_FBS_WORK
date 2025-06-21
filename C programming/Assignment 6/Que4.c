//Find odd and even among the numbers
#include <stdio.h>
void main () {
	int ptr[10];
	printf("Enter the elements\n");
	for (int i=0; i<10; i++)
		scanf("%d",&ptr [i]);
	printf("[");
	for (int i=0; i<10; i++)
		printf("%d,",ptr[i]);
	printf("\b]\n");
	printf("Even =");
	for (int i=0; i<10; i++) {
		if (ptr[i]%2==0)
			printf("%d,",ptr[i]);
	}
	printf("\nOdd =");
	for (int i=0; i<10; i++) {
		if (ptr[i]%2!=0)
			printf("%d,",ptr[i]);
	}


}