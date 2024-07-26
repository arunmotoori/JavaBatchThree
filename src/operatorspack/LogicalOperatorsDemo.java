package operatorspack;

public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		
		//Logical And Operator - &&
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		System.out.println("---------------");
		//Logical OR Operator - ||
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println("---------------");
		//Logical Not Operator - !
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

}
