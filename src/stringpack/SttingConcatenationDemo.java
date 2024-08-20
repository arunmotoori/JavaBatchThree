package stringpack;

public class SttingConcatenationDemo {

	public static void main(String[] args) {
		
		String fName = "Arun";
		String lName = "Motoori";
		
		System.out.println(fName+" "+lName);  // Arun Motoori
		
		String fullName = fName.concat(" ").concat(lName);
		
		System.out.println(fullName);
		
	}

}
