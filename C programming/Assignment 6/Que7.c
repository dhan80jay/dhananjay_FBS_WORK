//Take two array and add sum in third array
#include <stdio.h>
void main (){
	int ptr1[10];
	printf("Enter the elements of first array\n");
		for (int i=0; i<10; i++)
		scanf("%d",&ptr1 [i]);
		
			int ptr2[10];
	printf("Enter the elements of second array\n");
		for (int i=0; i<10; i++)
		scanf("%d",&ptr2 [i]);
		
			int ptr3[10];
				printf("[");
	for (int i=0; i<10; i++){
		ptr3[i]=ptr1[i]+ptr2[i];
		printf("%d,",ptr3[i]);
			}
	printf("\b]\n");
}