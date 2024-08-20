package overloadingpack.three;

public class Sample {
	
	public Sample() {
		System.out.println("Inside Sample");
	}
	
	public Sample(int a) {
		System.out.println("Inside Sample"+a);
	}
	
	public Sample(double a) {
		System.out.println("Inside Sample - "+a);
	}
	
	public Sample(int a,int b) {
		System.out.println("Inside Sample"+(a+b));
	}

}
