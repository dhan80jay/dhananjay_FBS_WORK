//Print alternate elements in array.
#include <stdio.h>
void main (){
	int ptr[10];
	printf("Enter the elements\n");
		for (int i=0; i<10; i++)
		scanf("%d",&ptr [i]);
		printf("[");
	for (int i=0; i<10; i=i+2)
		printf("%d,",ptr[i]);
	printf("\b]\n");
}