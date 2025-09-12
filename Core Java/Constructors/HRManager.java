class HRManager {
	int id;
	String name;
	double salary;
	double commission;

	void setId (int id) 
	{
		this.id=id;
	
	}

	void setName (String n)
	{
		this.name=n;
	}

	void setSalary (double s)
	{
		this.salary=s;
	}

	void setCommission (double c)
	{
		this.commission=c;
	}


	int getId ()
	{
		return this.id;
	}
	
	String getName ()
	{
		return this.name;
	}

	double getSalary ()
	{
		return this.salary;
	}

	double getCommission()
	{
		return this.commission;
	}

	HRManager ()
	{
		this.id=5;
		this.name="Ajay";
		this.salary=20000;
		this.commission=5;
	System.out.println("In default constructor");
	}

	HRManager (int i,String n,double s,double c)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.commission=c;
	System.out.println("In parameterized constructor");
	}

	
	void display ()
	{
	System.out.println("HR Id is :" + this.id);
	System.out.println("HR  Name is :"+this.name);
	System.out.println("HR Salary is :" +this.salary);
	System.out.println("HR commission is :"+this.commission+"%");
	}
}// HR manager class ends here



class Test {
	public static void main (String [] args){
		HRManager h1=new HRManager();
		h1.display ();
		
		System.out.println("\n");
		
		HRManager h2=new HRManager (2,"Dhananjay",500000,10);
		h2.display ();
			
	/*	h1.setId (2);
		h1.setName ("Dhananjay");
		h1.setSalary (500000);
		h1.setCommission(10);		

		h1.display ();	*/

	}//main method ends here

}//Test class ends here









