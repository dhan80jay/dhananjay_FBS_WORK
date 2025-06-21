//Accept array and print only prime numbers of array
#include <stdio.h>
void main () {
	int ptr[10];
	printf("Enter the elements\n");
	for (int i=0; i<10; i++)
		scanf("%d",&ptr [i]);
	printf("[");
	for (int i=0; i<10; i++) {
		int count=0;
		for (int j=2; j<ptr[i]; j++) {
			if (ptr[i]%j==0) {
				count=1;
				break;
			}
		}
		if (count==0)
			printf("%d,",ptr[i]);
	}
	printf("\b ]\n");
}