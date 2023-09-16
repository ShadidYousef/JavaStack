import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    	Item item1 = new Item();
    	item1.name = "mocha";
    	item1.price = 15;
    	Item item2 = new Item();
    	item2.name = "latte";
    	item2.price = 20;
    	Item item3 = new Item();
    	item3.name = "drip coffee";
    	item3.price = 15;
    	Item item4 = new Item();
    	item4.name = "cappaccino";
    	item4.price = 10;
    	
    	
        // Order variables -- order1, order2 etc.
    	Order order1 = new Order();
    	order1.name = "Cindhuri";
    	order1.ready = true;
    	Order order2 = new Order();
    	order2.name = "Jimmy";
    	order2.addItem(item1.name);
    	order2.ready = true;
    	Order order3 = new Order();
    	order3.name = "Noah";
    	order3.addItem(item4.name);
    	
    	Order order4 = new Order();
    	order4.name = "Sam";
    	order4.addItem(item2.name);
    	order4.addItem(item2.name);
    	order4.addItem(item2.name);
    	
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Items: %s\n", order2.items);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}
