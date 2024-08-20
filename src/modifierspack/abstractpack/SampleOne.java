package modifierspack.abstractpack;

public abstract class SampleOne {
	
//	abstract int a = 5;
	
	public abstract void methodOne();
	
	public void methodTwo() {
		System.out.println("Inside mehtodTwo");
	}
	
	public abstract void methodThree();
	
	public void methodFour() {
		System.out.println("Inside methodFour");
	}

}

class SampleTwo extends SampleOne{
	
	public void methodOne() {
		System.out.println("Inside methodOne");
	}
	
	public void methodThree() {
		System.out.println("Inside methodThree");
	}

}
