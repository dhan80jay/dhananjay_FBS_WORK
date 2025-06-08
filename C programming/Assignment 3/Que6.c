//Perfect number or not
#include <stdio.h>
void main ()
{
	int no,sum=0,i=1;
	printf("Enter the number ");
	scanf("%d",&no);
	while (i<no){
		if (no%i==0){
			sum+=i;
		}
		i++;
	}
	if (sum==no)
	printf("Perfect");
	else
	printf("Not perfect");
}