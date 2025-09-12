class Car {
	String brand,model;
	int year;
	double price;
	
	void setModel (String mod) 
	{
		this.model=mod;
	
	}

	void setBrand (String br)
	{
		this.brand=br;
	}


	void setYear (int y)
	{
		this.year=y;
	}

	void setPrice (double pri)
	{
		this.price=pri;
	}


	String getModel ()
	{
		return this.model;
	}

	String getBrand ()
	{
		return this.brand;
	}


	double getPrice ()
	{
		return this.price;
	}
	
	Car ()
	{
		this.model="x49";
		this.brand="Mahidra";
		this.year=1989;
		this.price=1800000;
		System.out.println("In default Constructor");
	}

	Car (String m,String b, int y,double p)

	{
		this.model=m;
		this.brand=b;
		this.year=y;
		this.price=p;
		System.out.println("In Parameterized Constructor");
	}

	
	void display ()
	{
	System.out.println("Model name is :" + this.model);
	System.out.println("Brand  is :"+this.brand);
	System.out.println("Year is :" +this.year);
	System.out.println("Price is :"+this.price);
	}
			
}//car class ends here


class Test {
	public static void main (String [] args){
		Car c1=new Car();
		c1.display();
		System.out.println("\n");
		
		Car c2=new Car("X5","Toyota",1993,345677);
		c2.display();



	/*	c1.setModel ("X5");
		c1.setBrand ("Toyota");
		c1.setYear (1993);
		c1.setPrice (4575678);
		c1.display ();	*/

	}//main method ends here

}//Test class ends here

