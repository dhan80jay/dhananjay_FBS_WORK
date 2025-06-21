//Find sum of all numbers.
#include <stdio.h>
void main (){
	int ptr[5];
	int sum;
	printf("Enter the elements\n");
		for (int i=0; i<5; i++)
		scanf("%d",&ptr [i]);
		printf("[");
	for (int i=0; i<5; i++)
		printf("%d,",ptr[i]);
	printf("\b]\n");
	for (int i=0;i<5;i++)
	sum=sum+ptr[i];
	printf("Sum of arrayElemet=%d",sum);
}