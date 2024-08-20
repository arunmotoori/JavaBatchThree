package modifierspack.staticpack;

public class ClassOne {
	
	int a = 5;
	static int b = 10;
	
	
	//static methods can only access static stuff directly
	//In order for the static methods to access non-static stuff, we need to create object
	public static void sampleOne() {
		
		System.out.println(b);
		sampleThree();
		
//		System.out.println(a);
//		sampleTwo();
		
		ClassOne co = new ClassOne();
		System.out.println(co.a);
		co.sampleTwo();
		
	}
	
	//Non-static or instance methods can access both static and non-static stuff directly
	public void sampleTwo() {
		System.out.println("Inside sampleTwo");
		System.out.println(a);
		System.out.println(b);
		sampleOne();
		sampleThree();
	}
	
	public static void sampleThree() {
		System.out.println("Inside sampleThree");
	}

}
