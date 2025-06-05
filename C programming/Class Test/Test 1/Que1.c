//Convert time entered in hr,min and sec into total seconds.
#include <stdio.h>
void main () {
	int hr,min,sec,total_sec;
	printf("Enter the hours\n");
	scanf("%d",&hr);
	printf("Enter the minutes\n");
	scanf("%d",&min);
	printf("Enter the  seconds\n");
	scanf("%d",&sec);
	total_sec=hr*60+min*60+sec;
	printf("Total seconds = %d",total_sec);
}