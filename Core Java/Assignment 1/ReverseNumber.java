class ReverseNumber {
	public static void main (String [] agrs){
		int number =121;
		int temp=number;
		int i=1,lastDigit=0;
		int num=0;
		while(number > 0){
			lastDigit=number%10;
			num=num*10+lastDigit;
			number=number/10;
			i++;	
		}
	System.out.println("Reverse Number = "+num);
	}
}