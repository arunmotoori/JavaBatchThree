package methodspack;

public class MethodsReturningDataDemo {

	public static void main(String[] args) {
		
		sampleOne();
		sampleTwo(5,4);
//		int sum = sampleThree(9,3);
//		System.out.println(sum);
		System.out.println(sampleThree(9,3));
		
	}
	
	public static void sampleOne() {
		System.out.println("Inside sampleOne");		
	}
	
	public static void sampleTwo(int a,int b) {
		System.out.println(a+b);
	}
	
	public static int sampleThree(int a,int b) {
		return a+b;
	}

}
