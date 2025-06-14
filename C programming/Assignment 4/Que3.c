//Perfect number or not
#include <stdio.h>
void main ()
{
	int num;
	printf("Enter the number ");
	scanf("%d",&num);
	for (int j=1;j<num;j++){
	int sum=0,i=1;
	while (i<j){
		if (j%i==0){
			sum=sum+i;
		}
		i++;
	}
	if (sum==j)
	printf("%d ",j);
		}
}