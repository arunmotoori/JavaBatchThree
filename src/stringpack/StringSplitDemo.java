package stringpack;

public class StringSplitDemo {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		
		String[] sar = str.split(" ");
		
		for(String s : sar) {
			System.out.println(s);
		}
		
		String str2 = "My-name-is-Arun-Motoori";
		
		String[] sar2 = str2.split("-");
		
		for(String s : sar2) {
			System.out.println(s);
		}

	}

}
