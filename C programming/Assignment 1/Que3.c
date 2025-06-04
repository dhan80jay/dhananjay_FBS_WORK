//Leap year or not 
void main ()
{
	int year=1700;
	if (year%4==0 && year%100!=0 || year%400==0)
	{
		printf("Leap year");
	}
	else{
		printf("Not leap year");
	}
}