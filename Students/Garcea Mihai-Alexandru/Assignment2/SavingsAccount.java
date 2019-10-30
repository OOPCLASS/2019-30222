
public class SavingsAccount extends Account {
	public SavingsAccount(int number) {
		super(number);
	}
	private double interestRate;
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	public void addInterest() {
		super.deposit(interestRate*super.getBalance()/100);
	}
}
