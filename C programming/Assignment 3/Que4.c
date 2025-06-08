//Number is prime or not 
#include <stdio.h>
void main (){
	int no,count=0,i=1;
	printf("Enter the number ");
	scanf("%d",&no);
	while (i<=no){
		if (no%i==0)
		count++;
		i++;
	}	
	if (count==2)
	printf("Prime");
	else
	printf("Not Prime");
}