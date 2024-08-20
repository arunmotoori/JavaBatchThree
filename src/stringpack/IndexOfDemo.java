package stringpack;

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "I love Java Programming";
		
		int index1 = str.indexOf('o');
		
		System.out.println(index1); // Positive number
		
		int index2 = str.indexOf("Java");
		
		System.out.println(index2); // Positive number
		
		int index3 = str.indexOf("Python");
		
		System.out.println(index3); // - 1

	}

}
