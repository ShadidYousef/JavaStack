package mycafe;
import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    private double total=0;
    
    // CONSTRUCTOR
    public Order() {
    	this.name = "Guest";
    	this.items = new ArrayList<Item>();
    }
    
    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
    	this.name = name;
    	this.items = new ArrayList<Item>();
    	
    }
    
    // ORDER METHODS
    public void addItem(Item i) {
    	this.items.add(i);
    	this.total+=i.getPrice();
    }
    public String getStatusMessage() {
    	if (this.ready == true) {
    		return "Your order is ready.";
    	}
    	else {
    		return "Thank you for waiting. Your order will be ready soon.";
    	}
    }
    public double getOrderTotal() {
    	return this.total;
    }
    public void display() {
    	System.out.printf("Customer Name: %s\n",this.name);
    	for (int i=0; i<this.items.size(); i++) {
    		System.out.printf(this.items.get(i).getName() + " - $" + this.items.get(i).getPrice() + "\n");
    	}
    	System.out.printf("Total: $%s\n", this.total + "\n");
    }
    
    // GETTERS & SETTERS
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
}

