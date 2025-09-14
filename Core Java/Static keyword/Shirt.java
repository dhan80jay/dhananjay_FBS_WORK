class Shirt {
	int sid;
	String brand;
	String type;
	double price;	
	String size;	
	
	static double smallInc ;
	static double mediumInc;
	static double largeInc;
	static double xlargeInc;

	static {
		smallInc = 0;
		mediumInc =0.10;
		largeInc = 0.20;
		xlargeInc = 0.30;
	}

 
	
//Setters

	void setId (int i) {
		this.sid=i;	
	}

	
	void setBrand (String b) {
		this.brand=b;	
	}

	
	void setType (String t) {
		this.type=t;	
	}

	
	void setPrice (double p) {
		this.price=p;	
	}

	
	void setSize (String s) {
		size=s;	
	}

//Getters

	int getId () {
		return this.sid;
	}
	
	String getBrand () {
		return this.brand;
	}

	String getType () {
		return this.type;
	}
	
	double getPrice () {
		return this.price;
	}

	String getSize () {
		return this.size;
	}

//Constructors

	Shirt () {
		this.sid=1;
		this.brand="Raymond";
		this.type="formal";
		this.price=1000;
		this.size="small";
	}

	Shirt (int i,String b,String t,double p,String s) {
		this.sid = i;
		this.brand = b;
		this.type=t;
		this.price=p;
		this.size=s;
	}
	
	double calculateFinalPrice () {
		double finalPrice;
		if (this.size == "small") {
		 	return finalPrice = this.price +  smallInc;
		}

		else if (this.size == "medium"){
			return finalPrice = this.price + (this.price * mediumInc);
		}
		
		else if (this.size == "large"){
			return finalPrice = this.price + (this.price * largeInc);
		}
		
		else if (this.size == "xlarge"){
			return finalPrice = this.price + (this.price * xlargeInc);
		}
		
		else {
		System.out.println("Invalid size");
		return 0;
		}
	
	}
	

	void display (){

		System.out.println("Shirt id is :"+this.sid);
		System.out.println("Brand is :"	+this.brand);
		System.out.println("Type is :"	+this.type);
		System.out.println("Price is :"	+this.price);
		System.out.println("Size is :"	+this.size);
		System.out.println("Final Price is " +  calculateFinalPrice ());
	}

}//Shirt class ends here

class Test {
	public static void main (String [] args) {		

		Shirt s1 = new Shirt ();
		s1.display ();
		s1.calculateFinalPrice ();
	
		
		System.out.println();
	
		Shirt s2 = new Shirt (2,"Arrow","Casual",1000,"medium");
		s2.display ();
		s2.calculateFinalPrice ();
		
		System.out.println();
	
		Shirt s3 = new Shirt (3,"Levis","formal",1000,"large");
		s3.display ();
		s3.calculateFinalPrice ();

		System.out.println();
	
		Shirt s4 = new Shirt (4,"Arrow","Casual",1000,"xlarge");
		s4.display ();
		s4.calculateFinalPrice ();
		
	}//Main method ends here

}//Test class ends here

	
		

