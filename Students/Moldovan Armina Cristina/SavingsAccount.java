package Tema;


public class SavingsAccount extends Account {
	private double interest;
	
	public SavingsAccount(int number)
	{
		super(number);
	}
	
	public void addInterest(double value)
	{
		if (value > 0)
		{
		     interest += value;
	    } 
		else 
		{
		      System.err.println("Account.deposit(...): cannot deposit negative amount.");
	    }
	}
		
	public double getInterest()
	{
		return this.interest;
	}
}
