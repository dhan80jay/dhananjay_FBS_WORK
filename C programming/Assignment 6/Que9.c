//Reverse given array
#include <stdio.h>
void main (){
	int arr [5];
	printf("Enter the element of arr\n");
	for (int i=0; i<5; i++) {
		scanf("%d",&arr [i]);
	}
		printf("[");
	for (int i=5-1;i>=0;i--){
		printf("%d,",arr[i]);
	}
	printf("]");
}