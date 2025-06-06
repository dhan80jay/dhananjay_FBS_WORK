//Student is pass or fail
#include <stdio.h>
void main ()
{
	int marks;
	printf("Enter the marks ");
	scanf("%d",&marks);
	if (marks>100 || marks<0)
	printf("Invalid marks");
	else if (marks>=75)
	printf("Distinction");
	else if (marks>=65)
	printf("First class");
	else if (marks>=55)
	printf("Second class");
	else if (marks>=40)
	printf("Third class");
	else
	printf("Fail");
}