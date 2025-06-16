//Leap year or not 
#include <stdio.h>
int leapyear ();
void main ()
{
int res = leapyear ();
if (res==1)
printf("Leap year");
else
printf("Not leap year");
}
int leapyear (){
	int year=2000;
	if (year%4==0 && year%100!=0 || year%400==0)
	return 1;
	else
	return 0;
}