package overridingpack;

public class SampleP {
	
//	public SampleP() {
//		
//	}
	
	public void sample() {
		
		System.out.println("Inside sample method of SampleP");
		
	}
	
	
}

class SampleC extends SampleP{
	
//	public SampleC() {
//		
//	}
	

	public void sample() {
		
		System.out.println("Inside sample method of SampleC");
		
	}
	
}



