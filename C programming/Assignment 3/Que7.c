//Factorial of number
#include <stdio.h>
void main (){
	int no,fact=1,count=1;
	printf("Enter the number\n");
	scanf("%d",&no);
	while(no>=count){
		fact=fact*count;
		count++;
	}
	printf("Factorial = %d",fact);
}