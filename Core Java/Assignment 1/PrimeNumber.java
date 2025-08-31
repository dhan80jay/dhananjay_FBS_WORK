class PrimeNumber {
	public static void main(String [] args){
		int number=17;
		 int isPrime=0;
		for(int i=2;i<number;i++){
		if (number%i==0){
		isPrime=1;
		break;
		}
		}
		if(isPrime==0)
		System.out.println("Number is prime");
		else
		System.out.println("Number is not prime");
	
	}

}