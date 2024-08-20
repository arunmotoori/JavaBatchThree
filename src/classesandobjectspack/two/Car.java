package classesandobjectspack.two;

public class Car {
	
	String company;
	String model;
	String color;
	double milage;
	double price;
	int wheels;
	
	public void setCarDetails(String com,String mod,String col,double mil,double pri,int whe) {
		
		company = com;
		model = mod;
		color = col;
		milage = mil;
		price = pri;
		wheels = whe;
		
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
