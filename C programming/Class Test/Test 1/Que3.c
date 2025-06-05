//Print last 2 digit
#include <stdio.h>
void main ()
{
	int no,l1,l2,q1;
	printf("Enter the number");
	scanf("%d",&no);
	q1=no/10;		
	l1=q1%10;		
	l2=no%10;		
	printf("The last digit is %d%d",l1,l2);
}