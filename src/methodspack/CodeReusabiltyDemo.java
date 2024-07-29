package methodspack;

public class CodeReusabiltyDemo {

	public static void main(String[] args) {
		
		operationsDemo(5,4);
		operationsDemo(15,12);
		operationsDemo(5,3);
		operationsDemo(23,2);
		
	}
	
	public static void operationsDemo(int x,int y) {
		int sum = x + y;
		System.out.println(sum);
		int sub = x - y;
		System.out.println(sub);
		int mul = x * y;
		System.out.println(mul);
		int div = x / y;
		System.out.println(div);
		System.out.println("--------------");
	}

}
