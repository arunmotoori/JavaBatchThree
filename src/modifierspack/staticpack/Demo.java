package modifierspack.staticpack;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(SampleOne.b);
		SampleOne.methodTwo();
		
		SampleOne so = new SampleOne();
		System.out.println(so.a);
		so.methodOne();
		
	}

}
