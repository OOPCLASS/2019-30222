
public class Bank {
	private Account[] accounts=new Account[100];
	private int numberOfAccounts=0;
	private double divident;
	public void setDivident(double divident) {
		this.divident=divident;
	}
	public void openAccount(Account account) {
		accounts[numberOfAccounts]=account;
		numberOfAccounts++;
	}
	public void closeAccount(Account account) {
		if(accounts[numberOfAccounts-1]==account) {
			accounts[numberOfAccounts-1]=null;
			numberOfAccounts--;
		}
		for(int index=0;index<numberOfAccounts-1;index++) {
			if(accounts[index]==account) {
				for(int index2=index+1;accounts[index2]!=null;index2++) {
					accounts[index2-1]=accounts[index2];
				}
				accounts[numberOfAccounts-1]=null;
				numberOfAccounts--;
				break;
			}
		}
	}
	public void printAccounts() {
		for(int index=0;accounts[index]!=null;index++) {
			accounts[index].print();
		}
	}
	public void update() {
		for(int index=0;accounts[index]!=null;index++) {
			if(accounts[index] instanceof SavingsAccount) {
				((SavingsAccount)accounts[index]).addInterest();
			}
			else if(accounts[index] instanceof CurrentAccount) {
				if(accounts[index].getBalance()<0) {
					System.out.println("Account "+accounts[index].getAccountNumber()+": Your account is in overdraft.");
				}
			}
		}
	}
	public void payDivident() {
		for(int index=0;accounts[index]!=null;index++) {
			accounts[index].deposit(divident);
		}
	}
}
