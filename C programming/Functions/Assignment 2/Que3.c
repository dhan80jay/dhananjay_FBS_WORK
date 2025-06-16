//Greatest number among three
#include <stdio.h>
void greatAmong3 ();
void main () {
	greatAmong3 ();
}
void greatAmong3 () {
	int no1,no2,no3;
	printf ("Enter three number\n");
	scanf("%d %d %d",&no1,&no2,&no3);
	if (no1>no2) {
		if (no1>no3)
			printf("Number one is greater");
		else
			printf("Number three is greater");
	} else {
		if(no2>no3)
			printf("Number two is greater");
		else
			printf("Number three is greater");
	}
}