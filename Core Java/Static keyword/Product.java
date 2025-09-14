class Product {
	int pid;
	String pname;
	double costPrice;
	int quantity;
	static double discount;
	
	static {
		discount=10;
	}

//Setters

	void setID (int id)
	{
		this.pid=id;
	}

	void setName (String n)
	{
		this.pname=n;
	}
	
	void setCostPrice (double p)
	{
		this.costPrice=p;
	}

	void setQuantity (int q)
	{
		this.quantity=q;
	}

	static void setDiscount (double dis)
	{
		discount=dis;
	}

//getters

	int getID ()
	{
		return this.pid;
	}

	String getName ()
	{
		return this.pname;
	}

	double getCostPrice ()
	{
		return this.costPrice;
	}
	
	int getQuantity ()
	{
		return this.quantity;
	}

	double getDiscount ()
	{
		return this.discount;
	}

//Constructors

	Product(){
		this.pid=5;
		this.pname="Laptop";
		this.costPrice=50000;
		this.quantity=500;
	}

	Product (int i,String n,double p,int q){
		this.pid=i;
		this.pname=n;
		this.costPrice=p;
		this.quantity=q;
	}
	
	void applyDiscount ()
	{
		costPrice = costPrice-(discount/100*costPrice);
		System.out.println("After Discount costPrice "+ costPrice);
	}
	
	void sellingPrice ()
	{
		double sell = costPrice * quantity;
		System.out.println("Selling Price is  " + sell);
		
	}
//Display function

	void display ()
	{
		System.out.println("Product Id is "+this.pid);
		System.out.println("Product name is "+this.pname);
		System.out.println("Product Price is "+this.costPrice);
		System.out.println("Product quantity is "+this.quantity);
		System.out.println("Discount is "+this.discount);
	 
	}
	
}//Product class ends here


class Test {
	public static void main (String [] args){
		Product.setDiscount(10);
		Product p1=new Product ();
		p1.display ();
		p1.applyDiscount();
		p1.sellingPrice();
		System.out.println();
		
		Product p2=new Product (5,"TV",5000,90);
		p2.display();
		p2.applyDiscount();
		p2.sellingPrice();
		System.out.println();

		Product p3=new Product (7,"Samsung",90000,20);
		p3.display();
		p3.applyDiscount();
		p3.sellingPrice();
		
	}//main method ends here

}//test class ends here	
	
	