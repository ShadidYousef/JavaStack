package mycafe;
import java.util.ArrayList;

public class CoffeeKiosk {
	private ArrayList<Item> menu;
	private ArrayList<Order> orders;
	
	public CoffeeKiosk() {
		this.menu = new ArrayList<Item>();
		this.orders = new ArrayList<Order>();
	}
	
	public void addMenuItem(String name, double price) {
		Item item = new Item(name, price);
        this.menu.add(item);
	}
	public void displayMenu() {
        for (int i = 0; i < menu.size() - 1; i++)
            System.out.println(i + " " + menu.get(i).getName() + "--" + "$" + menu.get(i).getPrice());
    }
	
	public ArrayList<Item> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Item> menu) {
		this.menu = menu;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	
}
