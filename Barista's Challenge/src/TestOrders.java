public class TestOrders {
    public static void main(String[] args) {
    
    	//orders
    	Order guest1 = new Order();
    	Order guest2 = new Order();
    	
    	Order order1 = new Order("Cindhuri");
    	Order order2 = new Order("Jimmy");
    	Order order3 = new Order("Noah");
    	
    	// Menu items
    	Item item1 = new Item("mocha", 15);
    	Item item2 = new Item("latte", 20);
    	Item item3 = new Item("drip coffee", 13);
    	Item item4 = new Item("cappuccino", 10);
    	
    	guest1.addItem(item1);
    	guest1.addItem(item2);
    	guest2.addItem(item3);
    	guest2.addItem(item1);
    	
    	order1.addItem(item3);
    	order1.addItem(item1);
    	order2.addItem(item4);
    	order2.addItem(item2);
    	order3.addItem(item2);
    	order3.addItem(item4);
    	
    	
    	
    	order1.setReady(true);
    	guest1.setReady(true);
    	
    	System.out.println("\n############################");
    	System.out.println("Valued " + order1.getName() + ", " + order1.getStatusMessage() + "!");
    	System.out.println("Valued " + order2.getName() + ", " + order2.getStatusMessage() + "!");
    	System.out.println("Valued " + guest1.getName() + ", " + guest1.getStatusMessage() + "!");	
    	
    	System.out.println("\n############################");
    	System.out.println(order1.getOrderTotal());
    	
    	System.out.println("\n############################");
    	guest1.display();
    	guest2.display();
    	order1.display();
    	order2.display();
    	order3.display();
    }
}
