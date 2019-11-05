package pack;

public class CurrentAccount extends Account implements Updateable {
    
	private double overdraftLimit=0.0;
	
	public CurrentAccount(int number) {
		super(number);
	}
	
	public void setOverdraftLimit(double overdraftLimit)
	{
		if(overdraftLimit>=0)
		{
			System.err.println("CurrentAccount.setOverdreftLimit(...) : can't have a positive overdraft limit");
		}
		else
		{
			this.overdraftLimit=overdraftLimit;
		}
	}
	
	public double getOverdraftLimit ()
	{
		return this.overdraftLimit;
	}
	
	@Override
	public void withdraw(double sum)
	{
		if( super.getBalance() - sum < this.overdraftLimit)
		{
			System.err.println("CurrentAccount.withdraw(..) : can't withdraw sum, overdtaft limit passed");
		}
		else {
			super.withdraw(sum);
		}
	}

	
	public void getLetter()
	{
		System.out.println("Letter sent");
	}
	
	@Override
	public void update() {
		if( super.getBalance() > this.overdraftLimit)
		{
			this.getLetter();
		}		
	}
	
   
}
