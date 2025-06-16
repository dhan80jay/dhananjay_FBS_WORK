// Even or odd
#include <stdio.h>
int evenodd ();
void main()
{
	int res=evenodd ();
	if (res==1)
	printf("Even");
	else
	printf("odd");
}
int evenodd (){
	int num=56;
	if (num%2==0)
	return 1;
	else
	return 0;
}