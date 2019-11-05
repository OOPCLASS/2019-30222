package pack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AccountsTest {
	  @Test
      public void testInterest()
      {
		  SavingsAccount save = new SavingsAccount(90);
		  save.addInterest(89.7);
    	  assertEquals(89.7,save.getInterest(),0.00001);
      }
	  
	  @Test
      public void testOverDraft()
      {
		  CurrentAccount current = new CurrentAccount(90);
		  current.setOverdraftLimit(-45.7);
    	  assertEquals(-45.7, current.getOverdraftLimit(),0.00001);
      }
	  
	  @Test
      public void testNumber()
      {
		  Account account = new Account(90);
    	  assertEquals(90,account.getAccountNumber(),0.00001);
      }
	  
	  @Test
      public void testWithdraw()
      {
		  Account account = new Account(90);
		  account.deposit(90.7);
    	  assertNotEquals(89.7,account.getBalance());
    	  assertEquals(90.7,account.getBalance(),0.0001);
      }
	  
	  @Test
      public void testWithdrawCurrentAccount()
      {
		  CurrentAccount account = new CurrentAccount(90);
		  account.deposit(90.7);
		  account.setOverdraftLimit(-8.8);
		  account.withdraw(678.9);
    	  assertEquals("Overdraft limit passed",90.7,account.getBalance(),0.00001);
      }
	  
	  @Test
      public void testDeposit()
      {
		  CurrentAccount account = new CurrentAccount(90);
		  account.deposit(90.7);
    	  assertEquals(90.7,account.getBalance(),0.00001);
      }
}
