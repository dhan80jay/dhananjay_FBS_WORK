// Given character is vowel or consonant
#include <stdio.h>
char vowelornot ();
void main ()
{
char check= vowelornot ();
if (check==1)
printf("Vowel");
else if (check==2)
printf("Consonant");
else if (check==3)
printf("Digit");
else if (check==4)
printf("Special character");
else
printf("Invalid");
}
char vowelornot (){
	char ch='&';
	if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	return 1;
	else if (ch>='A' && ch<='Z')
	return 2;
	else if (ch>='1' && ch<='9')
	return 3;
	else if (ch>='!' && ch<='*')
	return 4;
	else
	return 0;
	
}