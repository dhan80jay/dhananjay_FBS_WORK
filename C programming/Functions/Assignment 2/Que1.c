//Accept two number from user and an operator(+,-,*,%,/,) based on that perform desired operation.
#include <stdio.h>

int no1,no2,res;
char op;
void addition ();
void substraction ();
void multiplication ();
void divide ();
void mod ();
void main () {
	printf("Enter two number");
	scanf("%d%d",&no1,&no2);
	printf("Enter your operator (+,-,/,*,%%) \n");
	fflush(stdin);
	scanf("%c",&op);
	if (op == '+')
		addition ();
	else if (op == '-')
		substraction ();
	else if (op == '*')
		multiplication ();
	else if (op == '/')
		divide ();
	else if (op == '%')
		mod ();
	else
		printf("Invalid operator");

}
void addition () {
	res=no1+no2;
	printf("Result=%d",res);
}

void substraction () {
	res=no1-no2;
	printf("Result=%d",res);
}

void multiplication () {
	res=no1*no2;
	printf("Result=%d",res);
}

void divide () {
	res=no1/no2;
	printf("Result=%d",res);
}

void mod () {
	res=no1%no2;
	printf("Result=%d",res);
}
