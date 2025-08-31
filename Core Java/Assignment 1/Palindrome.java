class Palindrome{
	public static void main(String [] args){
		int number =122;
		int temp=number;
		int i=1,lastDigit=0;
		int num=0;
		while(number > 0){
			lastDigit=number%10;
			num=num*10+lastDigit;
			number=number/10;
			i++;	
		}

		if(temp==num)	
		System.out.println("Number is palindrome");
		else
		System.out.println("Number is not palindrome");
	}
}