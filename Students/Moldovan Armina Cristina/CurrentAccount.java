package Tema;

public class CurrentAccount extends Account {

	private static int limitVariable = 100;

	public CurrentAccount(int number) {
		super(number);
	}

	public void deposit(double sum) {

		if (sum < limitVariable) {
			super.deposit(sum);

		} else {
			System.err.println("we can't add sum");
		}
	}
	public void withdraw(double sum) {
		if (sum < limitVariable) {
			super.withdraw(sum);
		} else {
			System.err.println("we can't do this");
		}
	}
}
