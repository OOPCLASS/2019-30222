package accounts.assignment;

public class Bank {

	private Account arr[]= new Account[300];
	private int accountCount=0;
	private double profit;
	public void newAccount(int number) {
		arr[accountCount]=new Account(number);
		accountCount++;
	}
	public void closeAccount(int number) {
		for(int i=0;i<accountCount;i++)
		{
			if(arr[i].getAccountNumber()==number)
				arr[i]= null;
			
		}
	}

	public void update() {
        for (Account verif : arr) {
            if (verif instanceof SavingsAccount) 
            {
                ((SavingsAccount) verif).addInterestRate(0.3);
            } 
            else if (verif instanceof CurrentAccount) {
                if (((CurrentAccount) verif).inOverdraft()) {
                    sendLetter(verif);
                    }
            	}
        }
	}
	public void payDividends(Account x) {
		x.deposit(profit*0.01);
	}

	public void sendLetter(Account x) {
		
	}
	public void testingAccounts(){
		arr[0]=new Account(11);
		arr[1]=new SavingsAccount(10);
		arr[2]=new CurrentAccount(25);
		accountCount+=3;
	}
	
	
	
	}