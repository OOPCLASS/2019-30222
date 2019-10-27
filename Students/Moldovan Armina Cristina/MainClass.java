package Tema;
public class MainClass {
	public static void main(String[] args)
	{
		Account account = new Account(10);//number=10;
		System.out.println(account.getBalance());
		account.deposit(58.8);
		System.out.println(account.getBalance());
		account.withdraw(23.5);
		
		System.out.println( account.getBalance());
		System.out.println( account.getAccountNumber());
		System.out.println(account);
		
		SavingsAccount savingAccount = new  SavingsAccount(100);
		savingAccount.addInterest(56.4);
		System.out.println( savingAccount.getInterest());
		 
		CurrentAccount currentAccount = new  CurrentAccount(1000);
		currentAccount.deposit(1.3);
	    System.out.println(currentAccount.getBalance());
	    
	    currentAccount.withdraw(0.3);
	    System.out.println(currentAccount.getBalance());
	    
	    Bank bank = new Bank();
	    bank.openAccount(currentAccount, 0);
	    System.out.println(bank.getAccount(0));
	    
	    bank.openAccount(savingAccount, 1);
	    System.out.println(bank.getAccount(1));
	  
	}
}
