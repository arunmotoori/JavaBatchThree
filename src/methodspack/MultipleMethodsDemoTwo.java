package methodspack;

public class MultipleMethodsDemoTwo {
	
	public static void main(String[] args) {
		System.out.println("Start of main method");
		sampleMethodOne();
		System.out.println("End of main method");
	}

	public static void sampleMethodOne() {
		System.out.println("Start of sampleMethodOne");
		sampleMethodTwo();
		System.out.println("End of sampleMethodOne");
	}
	
	public static void sampleMethodTwo() {
		System.out.println("Start of sampleMethodTwo");
		sampleMethodThree();
		System.out.println("End of sampleMethodTwo");
	}
	
	public static void sampleMethodThree() {
		System.out.println("Start of sampleMethodThree");
		sampleMethodFour();
		System.out.println("End of sampleMethodThree");
	}
	
	public static void sampleMethodFour() {
		System.out.println("Start of sampleMethodFour");
		System.out.println("End of sampleMethodFour");
	}
	
}
