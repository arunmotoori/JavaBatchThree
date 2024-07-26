package flowcontrolstatementspack.selectionpack;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String foodItem = "burger";
		
		switch(foodItem) {
		
			case "burger": 
				System.out.println("Here is your burger");
				break;
			
			case "pasta":
				System.out.println("Here is your pasta");
			    break;
			
			case "noodles":
				System.out.println("Here are your noodles");
				break;
			
			case "pizza":
				System.out.println("Here is your pizza");
				break;
			
			default:
				System.out.println("We only server burger/pasta/noodles/pizza here.");
		
		}

	}

}
