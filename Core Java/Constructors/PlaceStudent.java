class PlacedStudent {
	String name,designation;	
	int distance;

	void setName (String n)
	{
		this.name=n;
	}
	
	void setDesignation (String d)
	{
		this.designation=d;
	}
	
	void setDistance (int dis)
	{
		this.distance=dis;
	}

	String getName ()
	{
		return this.name;
	}

	String getDesignation ()
	{
		return this.designation;
	}

	int getDistance ()
	{
		return this.distance;
	}

	PlacedStudent ()
	{
		this.name="Ajay";
		this.designation="designation";
		this.distance=300;
	System.out.println("In default constructor");
	}
		
	PlacedStudent (String n,String desig,int d)
	{
		this.name=n;
		this.designation=desig;
		this.distance=d;
	System.out.println("In parameterized constructor");
	}

	
	void display ()
	{
	System.out.println("Student name is  :"+this.name);
	System.out.println("Designation is :"+this.designation);
	System.out.println("Distance is :"+this.distance +"km");
	}
	

}// PlaceStudent class ends here

class Test {
	public static void main (String [] args){
		PlacedStudent p1 = new PlacedStudent ();
		p1.display();
		System.out.println("\n");
		
		PlacedStudent p2 = new PlacedStudent ("Dhananjay","Designation",300);
		p2.display();
		
	/*	p1.setName("Dhananjay");
		p1.setDesignation("Designation");
		p1.setDistance (300);

		p1.display ();	*/

	}//main method ends here

}//Place student class ends here
	
	
	