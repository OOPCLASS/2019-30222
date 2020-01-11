package accounts.assignment;

public class SavingsAccount extends Account {

	private Double interestRate = 2.0;
	
	public SavingsAccount(int number) {
		super(number);
		
	}
	public SavingsAccount(int number,double rate) {
		super(number);
		this.interestRate=rate;
		
	}
	public void addInterestRate(double rate) {
		if(this.interestRate+rate>0)
			this.interestRate+=rate;
		else
			System.err.println("SavingsAccount.addInterest:negative interest!");
	}
	
	@Override
	public void deposit(double sum) {
		super.deposit(sum+(sum * interestRate)/100);
	}
	
	
	@Override
	public String toString() {
		return "Account " + this.getAccountNumber() + ": " + "balance = " + this.getBalance() +"interest=" + interestRate;
	}
	
	

}
