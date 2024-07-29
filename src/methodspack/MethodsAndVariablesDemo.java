package methodspack;

public class MethodsAndVariablesDemo {
	
	static int a = 5; // Global variable
	static int d;

	public static void main(String[] args) {
		
		int b = 10; // Local Variable
		int e = 20;
		
		System.out.println(b);
		System.out.println(e);
		
		sample();
		
		System.out.println(a);
		
		//System.out.println(c);
		
		System.out.println(d);
		

	}
	
	public static void sample() {
		
		int c = 15; // Local Variable
		System.out.println(c);
		
		System.out.println(a);
		
		//System.out.println(b);
		
		System.out.println(d);
	}

}
