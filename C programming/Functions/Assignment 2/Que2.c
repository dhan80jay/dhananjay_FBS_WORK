//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include <stdio.h>
void triangle ();
void main () {	
	triangle ();
}
void triangle (){
	int s1,s2,s3;
	printf("Enter s1\n");
	scanf("%d",&s1);
	printf("Enter s2\n");
	scanf("%d",&s2);
	printf("Enter s3\n");
	scanf("%d",&s3);	
	if (s1==s2 && s2==s3)
	printf("equilateral");
	else if (s1==s2 && s2!=s3)
	printf("isosceles");
	else 
	printf("scalene");
}