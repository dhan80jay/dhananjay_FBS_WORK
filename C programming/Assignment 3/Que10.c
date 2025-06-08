//find sum of first and last digit
#include <stdio.h>
void main () {
	int no,sum=0,l1,f1;
	printf("Enter the number\n");
	scanf("%d",&no);
	l1=no%10;
	while(no>=10) {
		no=no/10;
	}
	f1=no;
	sum=f1+l1;
	printf("Sum of last and first digit is = %d",sum);
}