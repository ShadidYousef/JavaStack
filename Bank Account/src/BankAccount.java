
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
    	accounts++;
    }
    
    // GETTERS
    // for checking, savings, accounts, and totalMoney
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public static int getAccounts() {
		return accounts;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
	public void deposit(double saving, double checking) {
		this.savingsBalance += saving;
		this.totalMoney += saving;
		this.checkingBalance += checking;
		this.totalMoney += checking;
	}
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
	public void withdraw(double saving, double checking) {
		if (totalMoney != 0 && totalMoney >= saving) {
			this.savingsBalance -= saving;
			this.totalMoney -= saving;
		}
		if (totalMoney != 0 && totalMoney >= checking) {
			this.checkingBalance -= checking;
			this.totalMoney -= checking;
		}
		else {
			System.out.println("You don't have enough balance!");
		}
	}
    // getBalance
    // - display total balance for checking and savings of a particular bank account
	public double getBalance() {
		return this.getCheckingBalance();
	}
}
