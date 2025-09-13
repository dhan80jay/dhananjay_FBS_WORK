import java.util.Scanner;

class Shape {
 	void calculateArea (Triangle t)
	{
		double area=0.5*t.getHeight()*t.getBase () ;
		System.out.println("Area of Triangle :"+area);

	}

	void calculateArea (Circle c)
	{
		double area=3.14 * (c.getRadius () * c.getRadius ());
		System.out.println("Area of Circle :"+area);

	}


	void calculateArea (Rectangle r)
	{
		double area=r.getLength()*r.getBreadth();
		System.out.println("Area of Rectangle :"+area);
	
	}
}//Shape class ends here

class Triangle {
	double base,height;
	
	Triangle (){
		this.base = 45.0;
		this.height=43.0;
	}
	
	Triangle (double base,double height){
		this.base = base;
		this.height=height;
	}
	
	//Setters
	
	void setBase (double b)
	{
		this.base=b;
	}

	void setHeight (double h)
	{
		this.height=h;
	}
															
	//getters
	
	double getBase ()
	{
		return this.base;
	}

	double getHeight ()
	{
		return this.height;
	}
	
	void display ()
	{
		System.out.println("Base ="+this.base);
		System.out.println("Base ="+this.height);
	}

}//Triangle class ends here

class Circle {
	double radius;
	
	Circle (){
		this.radius=4;
	}
	
	Circle (double r){
		this.radius=r;
	}

	void setRadius (double r)
	{
		this.radius=r;
	}
	
	double getRadius ()
	{
		return this.radius;
	}

	void display ()
	{
		System.out.println("Radius :"+this.radius);
	}

}//class circle ends here

class Rectangle {
	double length;
	double breadth;
	
	Rectangle (){
		this.length=13.0;
		this.breadth=15.3;
	}

	Rectangle (double l, double b){
		this.length=l;
		this.breadth=b;
	}

	void setLength (double l)
	{
		this.length=l;
	}

	void setBreadth (double b)
	{
		this.breadth=b;
	}

	double getLength ()
	{
		return this.length;	
	}

	double getBreadth ()
	{
		return this.breadth;	
	}

	void display ()
	{
		System.out.println ("Lenght :"+this.length);
		System.out.println ("Breadth :"+this.breadth);
	}
	
	
}//Rectangle ends here
	
class Test {	
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		Shape s1=new Shape();
		
//Triangle		
		
		System.out.println();
		Triangle t1=new Triangle(5,3);
		t1.display ();
		s1.calculateArea (t1);

		System.out.println();

	
		System.out.println("Enter the Base :");
		double base = sc.nextDouble ();

		System.out.println("Enter the Height :");
		double height = sc.nextDouble ();
		


		Triangle t2 = new Triangle (base,height);
		t2.display();
		s1.calculateArea (t2);
		
		System.out.println();
		

		Circle c1 = new Circle (5);
		c1.display();
		s1.calculateArea (c1);

		System.out.println();


		System.out.println("Enter the radius :");
		double radius = sc.nextDouble ();
		Circle c2 = new Circle (radius);
		c2.display ();
		s1.calculateArea (c2);
//rectangle		

		System.out.println();
		Rectangle r1=new Rectangle (5,3);
		r1.display();
		s1.calculateArea(r1);
		
		System.out.println("Enter the length :");
		double length = sc.nextDouble ();
		
		System.out.println("Enter the breadth :");
		double breadth = sc.nextDouble ();
		
		Rectangle r2= new Rectangle (length,breadth);
		r2.display ();
		s1.calculateArea (r2);
		
	
	}//main method ends here

}//test class ends here
		
 	




	
	