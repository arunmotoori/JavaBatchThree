package classesandobjectspack.five;

public class Car {
	
	String company; // Instance global variable
	String model; // Instance global variable
	String color; // Instance global variable
	double milage; // Instance global variable
	double price; // Instance global variable
	static int wheels = 4;  // static global variables
	
	//Java maintains a hidden and empty constructor
	
//	public Car() {
//		System.out.println("Inside Car constructor");
//	}
	
	
	public Car(String company,String model,String color,double milage,double price) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.milage = milage;
		this.price = price;
	
	}
	
	public void startCar() {
		System.out.println(company+" car having model "+model+" has started");
	}
	
	public void stopCar() {
		System.out.println(company+" car having model "+model+" has stopped");
	}
	
	public void carDetails() {
		System.out.println("Company of the car is "+company);
		System.out.println("Model of the car is "+model);
		System.out.println("Color of the car is "+color);
		System.out.println("Milage of the car is "+milage);
		System.out.println("Price of the car is "+price);
		System.out.println("Number of wheels of the car are "+wheels);
		System.out.println("--------------------");
	}

}


