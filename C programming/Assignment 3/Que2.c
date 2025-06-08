//Print table for given number
#include <stdio.h>
void main ()
{
	int no,i=1,table;
	printf("Enter the number");
	scanf("%d",&no);
	while (i<=10){
		table=no*i;
		printf("%d\n",table);
		i++;
	}
}