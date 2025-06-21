//Search the given number in array
#include <stdio.h>
void main () {
	int arr[10];
	printf("Enter the elements\n");
	for (int i=0; i<10; i++){
		scanf("%d",&arr[i]);
	}
	printf("[");
	for (int i=0; i<10; i++)
		printf("%d,",arr[i]);
	printf("\b]\n");
	int num;
	printf("Enter the number");
	scanf("%d",&num);
	int found=0;
	for (int i=0; i<10; i++) {
		
		if (arr[i]==num) {

			printf("Number is found at index %d\n",i);
			found=1;
		}
	}
	if (found==0)
		printf("Not found");
	
}
	