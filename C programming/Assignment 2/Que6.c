//Divisible by 3,5 or both
#include <stdio.h>
void main (){
	int no;
	printf("Enter the number\n");
	scanf("%d",&no);
	if (no%3==0 && no%5==0)
	printf("Divisible by both");
	else if (no%3==0 && no%5!=0)
	printf("Divisible by three but not five");
	else if (no%5==0 && no%3!=0)
	printf("Divisible by five but not three");
	else
	printf("Divisible by none");
}