//Sum of numbers given range
#include <stdio.h>
void main () {
	int start=1,end=5;
	int i=start,sum=0;
	while(i<=end) {
		sum+=i;
		i++;
	}
	printf("sum=%d",sum);
}