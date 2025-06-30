//Find odd and even among the numbers
#include <stdio.h>
#include <stdlib.h>
void store (int*,int);
void display (int*,int);
void evenOdd(int*,int);
void main (){
	int *arr;
	int size;
	printf("Enter the size");
	scanf("%d",&size);
	arr=(int*)malloc(size*sizeof(int));
	printf("Enter the elements\n");
	store (arr,size);
	display (arr,size);
	evenOdd(arr,size);
	free(arr);
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

void evenOdd (int *ptr,int size){
	printf("Even =");
	for (int i=0;i<size;i++){
		if (ptr[i]%2==0)
		printf("%d,",ptr[i]);
	}
		printf("\nOdd =");
	for (int i=0;i<size;i++){
		if (ptr[i]%2!=0)
		printf("%d,",ptr[i]);
	}
	
}
