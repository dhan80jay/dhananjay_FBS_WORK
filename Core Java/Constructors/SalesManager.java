class SalesManager {
	int id;
	String name;
	double salary;
	double insentive;
	int target;

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

	void setInsentive (double ins)
	{
		this.insentive=ins;
	}
	
	void setTarget (int trg)
	{
		this.target=trg;
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
		
	double getInsentive ()
	{
		return this.insentive;
	}

	int getTarget ()
	{
		return this.target;
	}
	
	SalesManager ()
	{
		this.id=5;
		this.name="Ajay";
		this.salary=80000;
		this.insentive=1000;
		this.target=50;
	System.out.println("In default constructor");
	}

	SalesManager (int i,String n,double s,double ins,int t)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
		this.insentive=ins;
		this.target=t;
	System.out.println("In parameterized constructor");
	}
	
	void display ()
	{
	System.out.println("Sales Manager Id is : "+ this.id);
	System.out.println("Sales Manager Name is : "+ this.name);
	System.out.println("Sales Manager Salary is : "+ this.salary);		System.out.println("Sales Manager Insentive is : "+ this.insentive);
	System.out.println("Sales Manager Target is : "+ this.target);

	}


}//SalesManager class ends here

class Test {
	public static void main (String [] args){
		SalesManager sm = new SalesManager ();
		sm.display();
		System.out.println("\n");
	
		SalesManager sm2=new SalesManager (5,"Dhananjay",90000,2000,13);
		sm2.display ();
	/*	sm.setId (5);
		sm.setName ("Dhananjay");
		sm.setSalary (90000);
		sm.setInsentive (2000);
		sm.setTarget (13);
		
		sm.display();	*/
	
	}//Main method ends here

}//Test class ends here

