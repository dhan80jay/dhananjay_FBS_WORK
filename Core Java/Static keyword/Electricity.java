class ElectricityBill {
		int b_id;
		String name;
		int unit;
		static double ratePerUnit;
	
		static {
		ratePerUnit=12.9;
		}

//setters

	void setId (int i)
	{
		this.b_id=i;
	}
	
	void setName (String n)
	{
		this.name=n;
	}

	void setUnit (int u)
	{
		this.unit=u;
	}

	static void setRatePerUnit (double rp)
	{
		ratePerUnit=rp;
	}

//getters

	int getId ()
	{
		return	this.b_id;
	}

	String getName ()
	{
		return this.name;
	}

	int getUnit ()
	{
		return this.unit;
	}

	double getRatePerUnit ()
	{
		return this.ratePerUnit;
	}
	

//constructors

	ElectricityBill(){
		this.b_id=5;
		this.name="Dhananjay";
		this.unit=12;
	}

	ElectricityBill(int i,String n,int u){
		this.b_id=i;
		this.name=n;
		this.unit=u;
	}

	void display ()
	{
		System.out.println("Id is :"+this.b_id);
		System.out.println("Name is :"+this.name);
		System.out.println("Unit is :"+this.unit);
		System.out.println("Rate per Unit is :"+this.ratePerUnit);

	}
	
	void calculateBill ()
	{
	System.out.println("Rate Per Unit : "+this.unit*this.ratePerUnit);
	}
	
}//Electricity class ends here

class Test {
	public static void main (String [] args){
		ElectricityBill e1 = new ElectricityBill ();
		e1.display ();
		e1.calculateBill ();

		System.out.println();
		
		ElectricityBill.setRatePerUnit(3.4);
		
		ElectricityBill e2 = new ElectricityBill (3,"Ajay",13);
		e2.display ();
		
		ElectricityBill e3 = new ElectricityBill (4,"abc",18);
		e3.display ();
		
		e3.calculateBill ();
	
	}//main method ends here

}//Test class ends here

