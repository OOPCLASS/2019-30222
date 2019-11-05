package account;

public class CurrentAccount extends Account {
	
	private double overdraft;
	public CurrentAccount(int number) {
		super(number);
		this.setOverdraft(1000);
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public void withdraw (double sum) {
		double newBalance = this.getBalance();
		if(sum > 0) {
			if(newBalance + overdraft > 0)
			{
				if(newBalance > 0 ) {
					super.withdraw(newBalance);
					
				}
				newBalance -= sum;
				if (newBalance <= 0) {
					overdraft += newBalance;
					newBalance = 0;
					
				} else {
					super.deposit(newBalance);
				}
			}else {
				 System.err.println("Account.withdraw(...): overdraft limit exceeded");
			}
		}else {
			 System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}
	
	public String toString() {
		return "Account" + getAccountNumber() + "balance is " + getBalance () + "overdraft is" + overdraft;
	}
	
	
	
}
