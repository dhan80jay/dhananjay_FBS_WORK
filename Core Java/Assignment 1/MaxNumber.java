class MaxNumber {
	public static void main (String [] args){
		int number=1235439;
		int digit,max=0;
		for(int i=number;i>0;i++){
		digit=number%10;
		if(digit>max)
		max=digit;
		number=number/10;
		}
	System.out.println("Max Number = "+max);
	}
}