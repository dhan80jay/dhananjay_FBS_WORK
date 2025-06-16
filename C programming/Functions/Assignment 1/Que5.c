//Eligible for vote 
#include <stdio.h>
int eligible ();
void main ()
{
int vote = eligible ();
if (vote==1)
printf("Eligible");
else
printf("Not eligible");
}
int eligible (){
	int age=2;
	if (age>=18)
	return 1;
	else
	return 0;
}