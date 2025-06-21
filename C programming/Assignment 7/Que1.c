// Find minimum and maximum number in array.
#include <stdio.h>
void store (int*,int);
void display (int*,int);
void minMax (int*,int,int*,int*);
void main () {
	int arr [10];
	int min,max;
	printf("Enter the number");
	store (arr,10);
	display (arr,10);
	minMax (arr,10,&min,&max);
	printf("Minimum number = %d\n",min);
	printf("Maximum number =%d",max);
}

void store (int *ptr,int size) {
	for (int i=0; i<size; i++)
		scanf("%d",&ptr [i]);
}

void display (int *ptr,int size) {
	printf("[");
	for (int i=0; i<size; i++)
		printf("%d,",ptr[i]);
	printf("\b]\n");
}

void minMax(int *ptr,int size,int *min,int *max) {
	*min=ptr [0];
	*max=ptr [0];
	for (int i=0; i<size; i++) {
		if (ptr[i] < *min)
			*min=ptr[i];
		if (ptr [i] > *max)
			*max=ptr[i];
	}
}
