//Palindrome
#include <stdio.h>
void main () {
	int no,n1,rev=0,temp;
	printf("Enter the number\n");
	scanf("%d",&no);
	temp=no;
	while(no>0) {
		n1=no%10;
		rev=n1+(rev*10);
		no=no/10;
	}
	if (temp==rev)
		printf("Palindrome");
	else
		printf("Not palindrome");
}