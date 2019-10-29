
public class Main {

	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount(1);
		savingsAccount.deposit(6543.78);
		savingsAccount.addInterest(4.7f);
		
		CurrentAccount currentAccount = new CurrentAccount(2);
		currentAccount.deposit(100.50);
		currentAccount.setOverdraftLimit(-50.7);
		currentAccount.withdraw(100);
		
	}

}
