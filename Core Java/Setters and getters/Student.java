class Student {
	int roll;
	String name;
	int marks;

	void setRoll (int r)
	{
		this.roll=r;
	}
	
	void setName (String n)
	{
		this.name=n;
	}
	
	void setMarks (int m)
	{
		this.marks=m;

	}

	int getRoll ()
	{
		return this.roll;
	}

	String getName ()
	{
		return this.name;

	}

	int getMarks ()
	{
		return this.marks;
	}


	void display ()
	{
	System.out.println("Roll No is : "+this.roll);
	System.out.println("Name is : "+this.name);
	System.out.println("Marks is : "+this.marks);
	}

}//Student class ends here

class Test {
	public static void main (String [] args){
		Student s1 = new Student ();
		s1.setRoll (2);
		s1.setName ("Dhananjay");
		s1.setMarks (99);
		
	s1.display();
	
	}// test class ends here

}// Test class ends here

						