package pack;

public class Main {
          public static void main (String args[])
          {
        	  SavingsAccount save= new SavingsAccount(34);
        	  save.addInterest(3.7);
        	  System.out.println(save.getAccountNumber());
        	  System.out.println(save.getInterest());
        	  
        	  CurrentAccount current = new CurrentAccount(98);
        	  current.deposit(90.7);
        	  current.setOverdraftLimit(-67.98);
        	  System.out.println(current.getAccountNumber());
        	  System.out.println(current.getOverdraftLimit());
        	  current.setOverdraftLimit(7.9);
        	  current.setOverdraftLimit(-7.9);
        	  
        	  System.out.println(current.getBalance());
        	  current.withdraw(178.9);
        	  current.withdraw(95.9);
        	  
        	  Bank bank=new Bank();
        	  bank.openAccount(97);
        	  bank.openAccount(947);
        	  bank.openAccount(937);
        	  
        	  bank.closeAccount(89);
        	  bank.closeAccount(97);
        	  bank.closeAccount(97);
        	  bank.payDividend(89.7);
        	  
        	  
        	 
          }
}
