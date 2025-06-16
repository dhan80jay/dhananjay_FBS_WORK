//Character lowercase or uppercase
#include <stdio.h>
char lowerupper ();
void main ()
{
char check = lowerupper ();
if (check==1)
printf("Uppercase");
else if (check==2)
printf("Lowercase");
else
printf("Invalid");
}

char lowerupper (){
	char ch = 's';
	if (ch >= 'A' && ch<='Z' )
	return 1;
	else if (ch>='a' && ch<='z')
	return 2;
	else
	return 0;
}