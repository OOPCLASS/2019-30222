package pack;

public class Bank implements Updateable {
	private final static int MAX_ACCOUNTS=100;
	
	private Account[] accounts =new Account[MAX_ACCOUNTS];
	private int indexAccounts=0;
	
	public void testsAccounts()
	{
		accounts[0]=new Account(123);
		accounts[1]=new SavingsAccount(567);
		accounts[2]=new CurrentAccount(876);
		this.indexAccounts+=3;
	}
	
	@Override
	public void update() {
		for(int i=0;i<=this.indexAccounts;i++)
		{
			if( accounts[i] instanceof SavingsAccount )
			 {
				((SavingsAccount)accounts[i]).update();
			 }
			else if (accounts[i] instanceof CurrentAccount)
			{
				((CurrentAccount)accounts[i]).update();
			}
		}
		
	}
	
	public void openAccount(int number)
	{
		accounts[this.indexAccounts]=new Account(number);
		this.indexAccounts++;
	}
	
	public void closeAccount(int number)
	{
		if(this.indexAccounts<1)
		{
			System.err.println("Bank.closeAccount(...): can't close, don't have any opened accounts");
			return;
		}
		
		int indexFoundAccount=-1;
		for (int i=0;i<this.indexAccounts;i++)
		{
			if(accounts[i].getAccountNumber() == number)
				indexFoundAccount=i;
		}
		
		if(indexFoundAccount == -1)
		{
			System.err.println("Bank.closeAccount(...): account not found");
			return;
		}
		
		for(int i=indexFoundAccount;i<this.indexAccounts-1;i++)
		{
			accounts[i]=accounts[i+1];
		}
		
		this.indexAccounts--;
	}
	
	public void payDividend (double dividend)
	{
		for(int i=0;i<this.indexAccounts;i++)
			accounts[i].deposit(dividend);
	}
	
	
	

}
