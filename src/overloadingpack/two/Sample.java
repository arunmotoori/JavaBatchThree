package overloadingpack.two;

public class Sample {
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,double b) {
		System.out.println(a+b);
	}
	
	public void add(double a,double b) {
		System.out.println(a+b);
	}
	
	public void add(double a,int b) {
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}
	
	public void add(int a,int b,int c,int d,int e) {
		System.out.println(a+b+c+d+e);
	}

}
