//Accept two number from user and an operator(+,-,*,%,/,) based on that perform desired operation.
#include <stdio.h>
void main () {
	int no1,no2,res;
	char op;
	printf("Enter two number");
	scanf("%d%d",&no1,&no2);
	printf("Enter your operator (+,-,/,*,%%) \n");
	fflush(stdin);
	scanf("%c",&op);
	if (op == '+') {
		res=no1+no2;
		printf("Result=%d",res);
	}

	else if (op == '-') {
		res=no1-no2;
		printf("Result=%d",res);
	}

	else if (op == '*') {
		res=no1*no2;
		printf("Result=%d",res);
	}

	else if (op == '/') {
		
		res=no1/no2;
		printf("Result=%d",res);

	}
	
	else if (op == '%') {
		res=no1%no2;
		printf("Result=%d",res);

	} 
	else
			printf("Invalid operator");
		
}
	