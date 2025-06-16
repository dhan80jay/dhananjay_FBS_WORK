//Print an inverted pyramid pattern
#include <stdio.h>
void main () {
	for (int i=1; i<=4; i++) {
		for (int j=4; j>=i; j--) {
			printf(" * ");
		}
		printf("\n");
		for (int k=1;k<=i;k++)
		printf(" ");
			
	}
}