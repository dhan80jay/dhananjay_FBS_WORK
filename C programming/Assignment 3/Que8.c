//Strong or not
#include <stdio.h>
void main ()
{
	int fact,no,i,sum=0,r,temp;
	printf("Enter the number ");
	scanf("%d",&no);
	temp=no;
	while (no>0){
	r=no%10;
	i=r;
	fact=1;
	while(i>=1){
		fact=fact*i;
		i--;
	}
	sum=sum+fact;
	no=no/10;
	}
	if(sum==temp)
	printf("Strong");
	else
	printf("Not strong");
}