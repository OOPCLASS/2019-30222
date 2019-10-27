
public class CurrentAccount extends Account {
	public CurrentAccount(int number) {
		super(number);
	}

	private double overdraftLimit;
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit=overdraftLimit;
	}
	
	@Override
	public void withdraw(double sum) {
		if(sum<=overdraftLimit) {
			super.withdraw(sum);
		} else {
			System.err.println("Account.withdraw(...): Your overdraft limit is: "+overdraftLimit);
		}
	}
}
