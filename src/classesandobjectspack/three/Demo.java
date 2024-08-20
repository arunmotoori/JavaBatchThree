package classesandobjectspack.three;

public class Demo {

	public static void main(String[] args) {
		
		Car hamz = new Car();
		
		hamz.setCarDetails("Honda","Amaze","Grey",14.13,900000,4);
		
		hamz.startCar();
		hamz.stopCar();
		hamz.carDetails();
		
		Car bmwX1 = new Car();
		
		bmwX1.setCarDetails("BMW", "X1", "Black", 12, 6000000, 4);

		bmwX1.startCar();
		bmwX1.stopCar();
		bmwX1.carDetails();
		
		Car hyi20 = new Car();
		
		hyi20.setCarDetails("Hyundai","i20","White",16,1200000,4);

		hyi20.startCar();
		hyi20.stopCar();
		hyi20.carDetails();

	}

}
