package overloadingpack.one;

public class SampleOne {
	
	public void demo() {
		System.out.println("Inside demo method");
	}
	
	public void demo(int a) {
		System.out.println("Inside demo method"+a);
	}
	
	public void demo(int a,int b) {
		System.out.println("Inside demo method"+a+b);
	}

}
