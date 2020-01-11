package accounts.assignment;

public class CurrentAccount extends Account {
	
	private double overdraft=0;
	
	public CurrentAccount(int number) {
		super(number);
		
	}
	@Override
	public void withdraw(double sum) {
		if(this.getBalance()-sum>=overdraft)
			super.withdraw(sum);
		else
			System.err.println("CurrentAccount.withdraw: Overdraft limit passed!");
	}

	public void setOverdraft(double limit) {
		if(limit>0)
			System.err.println("CurrentAccount.setOverdraft: limit not valid!");
		else
			this.overdraft=limit;
	}
	
	public double getOverdraft() {
		return this.overdraft;
	}
	
	public boolean inOverdraft() {
		return getBalance()>0;
	}
}
