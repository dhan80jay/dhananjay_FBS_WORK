//Find sum of all numbers.
#include <stdio.h>
#include <stdlib.h>
void store (int*,int);
void display (int*,int);
void sumofArray (int*,int,int);
void main (){
	int *arr;
	int size;
	printf("Enter the size");
	scanf("%d",&size);
	arr=(int*)malloc(size*sizeof(int));
	printf("Enter the elements\n");
	store (arr,size);
	display (arr,size);
	int sum=0;
	sumofArray(arr,size,sum);
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

void sumofArray (int *ptr,int size,int sum){
	for (int i=0;i<size;i++)
	sum=sum+ptr[i];
	printf("Sum of arrayElemet=%d",sum);
}