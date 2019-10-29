
public class SavingsAccount extends Account {
	private float interestRate = 0.0f;
	
	public SavingsAccount(int number) {
		super(number);
	}
	
	public void addInterest(float interestRate) {
		if(this.interestRate + interestRate >= 0) {
			this.interestRate += interestRate;
		} else {
			System.err.println("SavingsAccount.addInterest(...): interestRate cannot be negative.");
		}
	}
	
	public float getInterestRate() {
		return interestRate;
	}
}
