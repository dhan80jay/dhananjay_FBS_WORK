//Armstrong or not
#include <stdio.h>
void main ()
{
	int no,sum=0,count=0,r1;
	printf("Enter the number ");
	scanf("%d",&no);
	int temp=no;
	while (no>0){
		r1=no%10;	
		no=no/10;
		sum=sum+(r1*r1*r1);
	}
	if (temp==sum)
	printf("Armstrong");
	else
	printf("Not armstrong");

}