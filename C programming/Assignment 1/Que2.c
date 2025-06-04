//Pallindrone or not
void main ()
{
	int num=324,r1,r2,r3;
	int q1;
	r1=num%10;      //r1=4
	q1=num/10;		
	r2=q1%10;		//r2=2
	r3=q1/10;		//r3=3
	int rev=r1*100+r2*10+r3;
	if(rev==num)
	{
		printf("Pallindrome");
	}
	else{
		printf("Not Pallindrome");
	}
}