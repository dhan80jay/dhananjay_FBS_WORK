//student discount
#include<stdio.h>
void studentDiscount ();
double price=6500;
double tprice;
char isStudent='n';
void main () {
	studentDiscount ();
}
void studentDiscount () {

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
	printf("Your actual price was %2lf after discount your price is %3lf",price,tprice);
}