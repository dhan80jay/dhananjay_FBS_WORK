
class Applience {
	String brand;
	String model;
	int power;
	int warranty;
	double price;
	String manufactureDate;
	
	Applience() {
	
		this.brand = "Samsung";
		this.model = "Galaxy S24 Ultra";
		this.power = 5000;
		this.warranty = 2;
		this.price = 129999;
		this.manufactureDate = "2025-02-10";
	}

	Applience(String brand, String model, int power, int warranty, double price, String manufactureDate) {
		this.brand = brand;
		this.model = model;
		this.power = power;
		this.warranty = warranty;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	int getPower() {
		return power;
	}

	void setPower(int power) {
		this.power = power;
	}

	int getWarranty() {
		return warranty;
	}

	void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getManufactureDate() {
		return manufactureDate;
	}

	void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	void display () {
		System.out.println("Brand is : "+this.brand);
		System.out.println("Model is : "+this.model);
		System.out.println("Power is : "+this.power);
		System.out.println("Warranty is : "+this.warranty);
		System.out.println("Price is : "+this.price);
		System.out.println("Manufacture date is : "+this.manufactureDate);
	}
	
}//

class WashingMachine extends Applience{
	double capacity;
	String mode;
	int spinSpeed;
	WashingMachine() {
		super();
		this.capacity = 7.5;
		this.mode = "Quick Wash";
		this.spinSpeed = 1200;
	}
	WashingMachine(String brand, String model, int power, int warranty, double price, String manufactureDate,double capacity, String mode, int spinSpeed) {
		super(brand,model,power,warranty,price,manufactureDate);
		this.capacity = capacity;
		this.mode = mode;
		this.spinSpeed = spinSpeed;
	}
	double getCapacity() {
		return capacity;
	}
	void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	String getMode() {
		return mode;
	}
	void setMode(String mode) {
		this.mode = mode;
	}
	int getSpinSpeed() {
		return spinSpeed;
	}
	void setSpinSpeed(int spinSpeed) {
		this.spinSpeed = spinSpeed;
	}
	
	void display () {
		super.display();
		System.out.println("Capacity is : "+this.capacity);
		System.out.println("Mode is : "+this.mode);
		System.out.println("Spin Speed is : "+this.spinSpeed);
	}

}//Washing machine ends here

class Microwave extends Applience {
	double maxTemperature;
	int timer;
	boolean grillFunction;
	Microwave() {
		super();
		this.maxTemperature = 250;
		this.timer = 60;
		this.grillFunction = true;
	}
	
	Microwave(String brand, String model, int power, int warranty, double price, String manufactureDate,double maxTemperature, int timer, boolean grillFunction) {
		super(brand,model,power,warranty,price,manufactureDate);
		this.maxTemperature = maxTemperature;
		this.timer = timer;
		this.grillFunction = grillFunction;
	}

	double getMaxTemperature() {
		return maxTemperature;
	}

	void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}

	int getTimer() {
		return timer;
	}

	void setTimer(int timer) {
		this.timer = timer;
	}

	boolean isGrillFunction() {
		return grillFunction;
	}

	void setGrillFunction(boolean grillFunction) {
		this.grillFunction = grillFunction;
	}
	
	
	void display () {
		super.display();
		System.out.println("Max Temperature is : "+this.maxTemperature);
		System.out.println("Timer is : "+this.timer);
		System.out.println("Grill Function is : "+this.grillFunction);
	}
	
}//Microwave ends here

class Refrigerator extends Applience{
	double capacity;
	double temperature;
	int noOfDoors;
	Refrigerator() {
		super();
		this.capacity = 350;
		this.temperature = 2;
		this.noOfDoors = 2;
	}
	Refrigerator(String brand, String model, int power, int warranty, double price, String manufactureDate,double capacity, double temperature, int noOfDoors) {
		super(brand,model,power,warranty,price,manufactureDate);
		this.capacity = capacity;
		this.temperature = temperature;
		this.noOfDoors = noOfDoors;
	}
	double getCapacity() {
		return capacity;
	}
	void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	double getTemperature() {
		return temperature;
	}
	void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	int getNoOfDoors() {
		return noOfDoors;
	}
	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	void display () {
		super.display();
		System.out.println("Capacity is : "+this.capacity);
		System.out.println("Temperature is : "+this.temperature);
		System.out.println("Number of doors is : "+this.noOfDoors);
	}
	
}//Refrigerator ends here

class TestApplience {
	public static void main (String [] args) {
		Applience a1 = new Applience ();
		a1.display();
		
		System.out.println();
		
		Applience a2 = new Applience ("Sony","Bravia X90L",250,3,12222,"2024-11-25");
		a2.display();
		
		System.out.println();
		
		WashingMachine m1 = new WashingMachine ();
		m1.display();
		
		System.out.println();
		
		WashingMachine m2 = new WashingMachine ("Sony","Bravia X90L",250,3,12222,"2024-11-25",10,"Eco wash",1400);
		m2.display();
		
		System.out.println();
		
		Microwave mw1 = new Microwave();
		mw1.display();
		
		System.out.println();
		
		Microwave mw2 = new Microwave("Sony","Bravia X90L",250,3,12222,"2024-11-25",250,60,true);
		mw2.display();
		
		System.out.println();
		
		Refrigerator r1 = new Refrigerator ();
		r1.display();
		
		System.out.println();
		
		Refrigerator r2 = new Refrigerator ("Sony","Bravia X90L",250,3,12222,"2024-11-25",456,8,7);
		r2.display();
		
		
	}
}

