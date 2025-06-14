//Print prime numbers in the given range 1 to n.
#include <stdio.h>
void main () {
	int num,i;
	printf("Enter the number ");
	scanf("%d",&num);
	for (int j=2; j<num; j++) {
		for (i=2; i<j; i++) {
			if (j%i==0) {
				break;
			}
		}
		if (i==j)
			printf("%d ",i);
	}

}