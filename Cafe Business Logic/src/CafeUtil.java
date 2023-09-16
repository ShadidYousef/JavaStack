import java.util.ArrayList;

public class CafeUtil {
	
//	ArrayList<String> customers = new ArrayList<String>();
	
	public static int getStreakGoal() {
		int total = 0;
		for (int i=0; i<=10; i++) {
			total+=i;
        }

        return total;
	}
	
	public static double getOrderTotal(double[] prices) {
		double totalPrice = 0;
		for (int i=0; i<prices.length; i++) {
			totalPrice+=prices[i];
		}
		return totalPrice;
	}
	
	public static void displayMenu(ArrayList<String> menuItems) {
		for (int i=0; i<menuItems.size(); i++) {
			System.out.println(i + " " + menuItems.get(i));
		}
	}
	
	public static void addCustomer(ArrayList<String> customers) {
		System.out.println("Please enter your name:");
		String username = System.console().readLine();
		System.out.println("Hello " + username);
		
//		for (int i=0; i<4; i++) {
//			customers.add(username);
//			System.out.println("Hello, " + customers.get(i) + " there are " + i + " people ahead of you.");
//		}
	}
}
