package account;

public class SavingsAccount extends Account {
	
	private Double interest;
	
	public SavingsAccount(int number) {
		super(number);
		this.interest = 0.0 ;
		// TODO Auto-generated constructor stub
	}
	public double getInterest() {
		return this.getInterest();	 	
	}
	public void setinrterest(Double interest) {
		this.interest = interest;
	}
	@Override
	public void deposit(double sum) {
		if (sum > 0) {
			super.deposit(sum);
			super.deposit(interest/100 + getBalance());
		} else {
		      System.err.println("Account.deposit(...): cannot deposit negative amount.");
	    }
	}
	public String toString() {
		return "Account " + getAccountNumber() + "balance is" + getBalance() +"interest is" 
				+ interest;
	}

}
