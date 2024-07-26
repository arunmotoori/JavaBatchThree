package operatorspack;

public class IncrementDecrementOperatorsTwoDemo {

	public static void main(String[] args) {
		
		int a = 5,b,c,d,e;
		
		b = ++a;  // a 6 b 6
		c = b--;  // c 6 
		d = --c;  // b 5 c 5 d 5 
		e = b++;  // e 5 
		          // b 6
		
		System.out.println(a); // 6
		System.out.println(b); // 6 
		System.out.println(c); // 5 
		System.out.println(d); // 5 
		System.out.println(e); // 5

	}

}
