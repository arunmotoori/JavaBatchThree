package overloadingpack.one;

public class Demo {

	public static void main(String[] args) {
		
		SampleOne sampleOne = new SampleOne();
		sampleOne.demo();
		sampleOne.demo(5,4);
		sampleOne.demo(9);
	}

}
