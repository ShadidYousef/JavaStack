
public class BankTest {
    public static void main(String[] args){
    	
        // Create 3 bank accounts
    	BankAccount account1 = new BankAccount();
    	BankAccount account2 = new BankAccount();
    	BankAccount account3 = new BankAccount();
    	
    	// Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
    	account1.deposit(70, 100);
    	account2.deposit(200, 67.44);
    	account3.deposit(500, 69.69);

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
    	account1.withdraw(30, 90);
    	
    	
        // Static Test (print the number of bank accounts and the totalMoney)
    	System.out.println("Total Accounts: " + BankAccount.getAccounts());
    	System.out.println("Account Balance: " + account1.getTotalMoney());
    }
}
