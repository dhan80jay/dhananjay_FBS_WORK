#include <stdio.h>
void main (){
	int no;
	printf("Enter the number");
	scanf("%d\n",&no);
	if (no>0)
	printf("Positive");
	else if(no<0)
	printf("Negative");
	else if (no==0)
	printf("Neutral");
	else 
	printf("Invalid");
}