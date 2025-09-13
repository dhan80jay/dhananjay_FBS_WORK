import java.util.Scanner;

class Date {

	int day,month,year;
	String dow;

	void setDay (int d)
	{
	   this.day=d;
	}

	void setDow(String str)
	{
		this.dow=str;
	}
	
	void setYear(int y)
	{
		this.year=y;
	}

	void setMonth(int m)
	{
		this.month=m;

	}

	int getDay ()
	{
	return this.day;	
	}

	int getMonth ()
	{
	return this.month;	
	}

	int getYear ()
	{
	return this.day;	
	}


	Date (){
		this.day=8;
		this.month=9;
		this.year=2025;
		this.dow="Monday";
	System.out.println("In Default constructor");

	}

	Date (int d,int m,int y,String dow)
	{
		this.day=d;
		this.month=m;
		this.year=y;
		this.dow=dow;
	System.out.println("In Parameterized constructor");
	}

	void display ()
	{
	System.out.println(this.day+ "/"+ this.month +"/" +this.year);
	System.out.println(this.dow);	
	}
}// Date class ends here;

class Test {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
	
		Date d1=new Date();
		d1.display ();

		System.out.println("Enter the day :");
		int day = sc.nextInt ();
		
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the dow :");
		String dow = sc.nextLine ();
		
			

		Date d2=new Date(day,month,year,dow);
		d2.display ();

	}//main method ends here
	
}//test class ends here 

