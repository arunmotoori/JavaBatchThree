package modifierspack.staticpack;

public class SampleOne {
	
	int a = 5; // Instance global variable
	static int b = 10; // static global variable
	
	//Instance method or non-static method
	public void methodOne() {
		System.out.println("methodOne method");
	}
	
	//static method
	public static void methodTwo() {
		System.out.println("methodtwo method");
	}

}


