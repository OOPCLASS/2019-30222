
public class Main {

	public static void main(String[] args) {
		Account account=new Account(436);
		account.deposit(-15);
		account.deposit(200);
		account.withdraw(100.5);
		account.print();
		Account savingAccount=new SavingsAccount(1024);
		savingAccount.deposit(100);
		savingAccount.print();
		((SavingsAccount)savingAccount).setInterestRate(2);
		((SavingsAccount)savingAccount).addInterest();
		savingAccount.print();
		Account currentAccount=new CurrentAccount(365);
		currentAccount.deposit(200);
		((CurrentAccount)currentAccount).setOverdraftLimit(100);
		((CurrentAccount)currentAccount).withdraw(150);
		currentAccount.print();
		((CurrentAccount)currentAccount).withdraw(50);
		currentAccount.print();
		Bank bank=new Bank();
		bank.openAccount(account);
		bank.openAccount(savingAccount);
		bank.openAccount(currentAccount);
		bank.update();
		bank.printAccounts();
		Account otherAccount=new CurrentAccount(4000);
		((CurrentAccount)otherAccount).setOverdraftLimit(300);
		otherAccount.withdraw(200);
		bank.openAccount(otherAccount);
		bank.update();
		bank.printAccounts();
		bank.closeAccount(otherAccount);
		bank.printAccounts();
		bank.closeAccount(savingAccount);
		bank.printAccounts();
		bank.setDivident(100);
		bank.payDivident();
		bank.printAccounts();
	}

}
