// Calculate electricity bill
#include <stdio.h>
void main (){

int units,rs;
printf("Enter the units");
scanf("%d",&units);
if (units>=1 && units<=50){
	rs=units*30;
	printf("Your unit is %d You have to pay %d rs",units,rs);
}
else if (units>=51 && units<=150){
	rs=units*40;
	printf("Your unit is %d You have to pay %d rs",units,rs);
}
else if (units>=151 && units<150){
	rs=units*50;
	printf("Your unit is %d You have to pay %d rs",units,rs);
}
else
printf("Invalid");

}
