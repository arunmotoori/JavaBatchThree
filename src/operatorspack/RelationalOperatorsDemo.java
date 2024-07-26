package operatorspack;

public class RelationalOperatorsDemo {

	public static void main(String[] args) {
		
		int a = 5, b = 9, c = 4, d = 5, e = 1;
		
		System.out.println(a==b); // false
		System.out.println(a==c); // false
		System.out.println(a==d); // true
		System.out.println("------------");
		System.out.println(a!=b); // true
		System.out.println(a!=c); // true
		System.out.println(a!=d); // false
		System.out.println("------------");
		System.out.println(a<b); // true
		System.out.println(a<c); // false
		System.out.println(a<d); // false
		System.out.println("------------");
		System.out.println(a>b); // false
		System.out.println(a>c); // true
		System.out.println(a>d); // false
		System.out.println("------------");
		System.out.println(a<=b); // true
		System.out.println(a<=c); // false
		System.out.println(a<=d); // true
		System.out.println("------------");
		System.out.println(a>=b); // false
		System.out.println(a>=c); // true
		System.out.println(a>=d); // true
		System.out.println("------------");

	}

}
