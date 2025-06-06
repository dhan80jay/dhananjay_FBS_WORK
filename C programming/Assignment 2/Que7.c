//Check person is tenager,adult,senior
#include <stdio.h>
void main (){
	int age;
	printf("Enter the age\n");
	scanf("%d",&age);
	if(age<0 || age>100)
	printf("Not valid");
	else if (age<12)
	printf("Child");
	else if (age>=12 && age<=19)
	printf("Teenager");
	else if (age>=20 && age<=59)
	printf("Adult");
	else 
	printf("Senior");
}