class CountDigits {
	public static void main (String [] args){
		int number = 2345346;
		int i=0;
		while(number > 0){
		number=number/10;
		i++;
		}
	System.out.println(i);
	}
}
			