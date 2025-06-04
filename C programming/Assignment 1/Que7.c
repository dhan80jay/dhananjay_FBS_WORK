//Total salary calculate
#include <stdio.h>
void main () {
	int basic = 4000,da,ta,hra;
	int total;

	if (basic<=5000) {
		da=basic/100*10;
		ta=basic/100*20;
		hra=basic/100*25;
		total=da+ta+hra;
		printf("Total salary =%d",total);

	} else {
		da=basic/100*15;
		ta=basic/100*25;
		hra=basic/100*30;
		total=da+ta+hra;
		printf("Total salary =%d",total);
	}
}