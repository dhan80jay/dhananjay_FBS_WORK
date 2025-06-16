//Print a Floyd’s triangle pattern
#include <stdio.h>
void main (){
	int count=1;
	for (int i=1;i<=4;i++){	//i=1 2 
		for (int j=1;j<=i;j++){ //j=1 2
			printf("%d ",count);	//count=1 2 3
			count++;
		}
		printf("\n");
	}
}