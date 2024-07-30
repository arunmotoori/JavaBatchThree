package concatenationpack;

public class Demo {

	public static void main(String[] args) {
		
		int a = 5, b = 4;
		String firstName = "Arun";
		String lastName = "Motoori";
		
		System.out.println(a+b); // 9 - Addition operator
		System.out.println(firstName+" "+lastName); // Concatenation 
		System.out.println(firstName+a); // Concatenation - Arun5
		System.out.println(firstName+a+b); // Arun54
		System.out.println(firstName+(a+b)); // Arun9
		System.out.println(a+b+firstName); // 9Arun
		
		System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
		System.out.println("The sum of "+a+" and "+b+" is: "+a+b);
		
	}

}
