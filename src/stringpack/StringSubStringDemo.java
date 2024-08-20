package stringpack;

public class StringSubStringDemo {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		
//		char[] s = str.toCharArray();
//		
//		for(char c : s) {
//			System.out.println(c);
//		}
		
		System.out.println("------------");
		
		String mStr = str.substring(7);
		
		System.out.println(mStr);
		
		String m2Str = str.substring(15,19);
		
		System.out.println(m2Str);

	}

}
