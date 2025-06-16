//Pallindrone or not
#include <stdio.h>
int palindrome ();
int reverse();
void main ()
{
int res = palindrome ();
if (res==1)
printf("Palindrome");
else
printf("Not Palindrome");
}
int palindrome (){
int num=121,r1,r2,r3;
	int q1;

	r1=num%10;      //r1=4
	q1=num/10;		
	r2=q1%10;		//r2=2
	r3=q1/10;		//r3=3
int rev= r1*100+r2*10+r3;
if(rev==num)
	return 1;
	else
	return 0;
}