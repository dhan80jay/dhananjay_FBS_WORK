import java.util.Scanner;

class Course {
	int courseId;
	String courseName;
	double fees;
	
	void setCourseId (int id) 
	{
		this.courseId=id;
	
	}

	void setCourseName (String n)
	{
		this.courseName= n;
	}


	void setFees (double f)
	{
		this.fees=f;
	}

	int getId ()
	{
		return this.courseId;
	}

	String getCourseName ()
	{
		return this.courseName;
	}

	double getFees	()
	{
		return this.fees;
	}

	Course ()
	{
		this.courseId=12;
		this.courseName="Python Fullstack";
		this.fees=44000;
	System.out.println("In default constructor");
	}

	Course (int i,String n,double f)
	{
		this.courseId=i;
		this.courseName=n;
		this.fees=f;
		System.out.println("In Parameterized constructor");

	}
	
	void display ()
	{
	System.out.println("Course Id name is :" + this.courseId);
	System.out.println("Course name  is :"+this.courseName);
 	System.out.println("Course fees is:"+this.fees);
	}
			
}//car class ends here


class Test {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		Course c1=new Course();
		c1.display ();
		System.out.println("\n");	
		
		System.out.println("Enter the id:");
		int id = sc.nextInt ();
		sc.nextLine();
		System.out.println("Enter the course name :");
		String name = sc.nextLine ();
	
		System.out.println("Enter the course fees :");
		double fees = sc.nextDouble ();
		System.out.println();
		Course c2=new Course(id,name,fees);
	
		c2.display();

	}//main method ends here

}//Test class ends here

