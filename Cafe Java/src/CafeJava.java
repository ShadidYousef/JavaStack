public class CafeJava {
 public static void main(String[] args) {
 // APP VARIABLES
 // Lines of text that will appear in the app.
 String generalGreeting = "Welcome to Cafe Java, ";
 String pendingMessage = ", your order will be ready shortly";
 String readyMessage = ", your order is ready";
 String displayTotalMessage = " Your total is $";

 // Menu variables (add yours below)
 double mochaPrice = 3.5;
 double dripCoffe = 19.99;
 double latte = 24.99;
 double cappuccino = 9.99;

 // Customer name variables (add yours below)
 String customer1 = "Cindhuri";
 String customer2 = "Yousef";
 String customer3 = "Muath";
 String customer4 = "Awad";

 // Order completions (add yours below)
 boolean isReadyOrder1 = false;
 boolean isReadyOrder2 = true;
 boolean isReadyOrder3 = true;
 boolean isReadyOrder4 = false;

 // APP INTERACTION SIMULATION (Add your code for the challenges below)
 // Example:
 System.out.println(generalGreeting + customer1); // Displays "Welcome to CafeJava, Cindhuri"
 // ** Your customer interaction print statements will go here ** //
 if (isReadyOrder1){
    System.out.println(readyMessage);
 }
 if (isReadyOrder4){
    System.out.println(customer4 + readyMessage +  displayTotalMessage + cappuccino );
 }
 else {
    System.out.println(customer4 + pendingMessage);
 }
 if (isReadyOrder2){
    System.out.println(customer2 + readyMessage + displayTotalMessage + latte*2);
 }
 else {
    System.out.println(customer2 + pendingMessage);
 }
 System.out.println(customer3 + readyMessage + displayTotalMessage + (latte - dripCoffe));
 }
}