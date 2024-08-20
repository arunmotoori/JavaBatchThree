package arraypack;

public class ForLoopForEachDemo {

	public static void main(String[] args) {
		
		int[] ar = {9,5,1,7,8,3,2,4};
		
//		for(int i=2;i<ar.length-2;i++) {
//			System.out.println(ar[i]);
//		}
		
		for(int e : ar) {
			System.out.println(e);
		}

	}

}
