package classesandobjectspack.one;

public class Demo {

	public static void main(String[] args) {
		
		Car hamz = new Car();
		
		hamz.company = "Honda";
		hamz.model = "Amaze";
		hamz.color = "Grey";
		hamz.milage = 14.13;
		hamz.price = 900000;
		hamz.wheels = 4;
		
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();
		
		Car bmwX1 = new Car();
		
		bmwX1.company = "BMW";
		bmwX1.model = "X1";
		bmwX1.color = "Black";
		bmwX1.milage = 12;
		bmwX1.price = 6000000;
		bmwX1.wheels = 4;
		
		bmwX1.startCar();
		bmwX1.stopCar();
		bmwX1.carDetails();
		
		Car hyi20 = new Car();
		
		hyi20.company = "Hyundai";
		hyi20.model = "i20";
		hyi20.color = "White";
		hyi20.milage = 16;
		hyi20.price = 1200000;
		hyi20.wheels = 4;
		
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.carDetails();

	}

}
