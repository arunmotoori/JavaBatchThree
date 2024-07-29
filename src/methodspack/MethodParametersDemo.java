package methodspack;

public class MethodParametersDemo {

	public static void main(String[] args) {
		addTwo(5,4); // Arguments
		addThree(3,7,4); // Arguments
		addFour(1,2,3,4); // Arguments
	}
	
	public static void addTwo(int a,int b) { // Parameters
		System.out.println(a+b);
	}
	
	public static void addThree(int a,int b,int c) { // Parameters
		System.out.println(a+b+c);
	}
	
	public static void addFour(int a,int b,int c,int d){ // Parameters
		System.out.println(a+b+c+d);
	}

}
