class Printer {
	
	void print (char c)
	{
	System.out.println(c);
	}
	
	void print (int a)
	{
	System.out.println(a);
	}
	
	void print (String s)
	{
	System.out.println(s);
	}
	
	
}//Printer class ends here

class Test {
	public static void main (String [] args){
		Printer p1 = new Printer();
		p1.print('D');
		p1.print(34);
		p1.print("Dhananjay");
	
	}//main method ends here

}//Test class ends here




	