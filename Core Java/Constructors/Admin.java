class Admin {
	int id;
	String name;
	double salary;
	double allowance;

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

	void setAllowance (double a)
	{
		this.allowance=a;
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

	double getAllowance()
	{
		return this.allowance;
	}

	void display ()
	{
	System.out.println("Admin Id is :" + this.id);
	System.out.println("Admin  Name is :"+this.name);
	System.out.println("Admin Salary is :" +this.salary);
	System.out.println("Admin allowance is :"+this.allowance);
	}

	Admin ()
	{
		this.id=3;
		this.name="Ajay";
		this.salary=9999;
		this.allowance=890;
	System.out.println("In default constructor");
	}//default constructor
	

	Admin (int i,String n,double s,double al)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.allowance=al;
	System.out.println("In parameterized constructor");
	}//Parameterized constructor
	

}// Admin class ends here



class Test {
	public static void main (String [] args){
		
		Admin a1=new Admin();
		a1.display ();
		
		Admin a2=new Admin(2,"Dhananjay",50000,2000);	
		a2.display();
	  
	  /*	a1.setId (2);
		a1.setName ("Dhananjay");
		a1.setSalary (500000);
		a1.setAllowance(1000);	*/	
		
		

	}//main method ends here

}//Test class ends here

