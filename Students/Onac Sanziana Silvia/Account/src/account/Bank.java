package account;

public class Bank {
	public Account[] account;
	protected int index;

	public Bank(int num) {
		this.account = new Account[num];
		index = 0;
	}

	public int getNum() {
		return index;
	}

	public void toUpdateAccount(double interest) {

	}

	public void openAccount(Account account) {
		for (int i = 0; i < index; i++) {
			if (this.account[i].getAccountNumber() == account.getAccountNumber()) {
				System.out.println("the account was already created");
				return;
			}
		}
		this.account[index++] = account;
	}
}
