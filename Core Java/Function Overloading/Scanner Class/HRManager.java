import java.util.Scanner;

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
		Scanner sc = new Scanner (System.in);
		HRManager h1=new HRManager();
		h1.display ();
		
		System.out.println("\n");
		
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		sc.nextLine ();
		System.out.println("Enter the Name :");
		String name = sc.nextLine();

		System.out.println("Enter the salary :");
		double salary = sc.nextDouble();

		System.out.println("Enter the commission :");
		double commission = sc.nextDouble();

		HRManager h2=new HRManager (id,name,salary,commission);
		h2.display ();
			

	}//main method ends here

}//Test class ends here
