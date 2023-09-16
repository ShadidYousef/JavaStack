import java.util.ArrayList;

public class Order {
	String name;
	double total;
	boolean ready;
	ArrayList<String> items = new ArrayList<String>();
	
	public void addItem(String item) {
		this.items.add(item);
		total++;
	}
}
