//student discount
#include<stdio.h>
void main () {
	double price=400;
	double tprice;
	char isStudent='n';
	if (isStudent == 'y') {
		if (price>500)
			tprice=price-price*0.20;
		else
			tprice=price-price*0.10;
	} else {
		if (isStudent == 'n') {
			if (price>=600)
				tprice=price-price*0.15;
			else
				tprice=price;
		}
	}
	printf("Your actual price was %lf after discount your price is %lf",price,tprice);
}