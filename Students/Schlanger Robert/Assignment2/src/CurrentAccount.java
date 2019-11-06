
public class CurrentAccount extends Account {
	private double overdraftLimit = 0;
	
	public CurrentAccount(int number) {
		super(number);
	}
	
	@Override
	public void withdraw(double sum) {
		if(!overdrawn(sum)) {
			super.withdraw(sum);
		} else {
			System.err.println("CurrentAccount.withdraw(...): cannot withdraw overdraftLimit passed.");
		}
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		if(overdraftLimit<=0) {
			this.overdraftLimit = overdraftLimit;
		} else {
			System.err.println("CurrentAccount.setOverdraftLimit(...): cannot setOverdraftLimit overdraftLimit can't be greater than 0");
		}
		
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	private boolean overdrawn(double sum) {
		return getBalance() - sum < overdraftLimit;
	}
	
	public boolean inOverdraft() {
		return getBalance() < 0;
	}
}
