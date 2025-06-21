//Merge two arrays
#include <stdio.h>
void main (){
	int arr1 [5];
	printf("Enter the element of arr\n");
	for (int i=0; i<5; i++) {
		scanf("%d",&arr1 [i]);
	}
	int arr2 [4];
	printf("Enter the element of brr");
		for (int i=0; i<4; i++) {
		scanf("%d",&arr2 [i]);
	}
	int crr [9];
	int i,j=0,k=0;
	for (i=0; i<5; i++) {
		crr[i]=arr1[j];
		j++;
	}
	for (int i=5; i<9; i++) {
		crr[i]=arr2[k];
		k++;
	}
	printf("[");
	for (int i=0; i<9; i++)
		printf("%d,",crr[i]);
	printf("\b]");
}