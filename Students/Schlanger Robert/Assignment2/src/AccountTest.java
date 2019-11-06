import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {

	@Test
	public void testAccountOperations() {
		CurrentAccount currentAccount = new CurrentAccount(1);
		SavingsAccount savingsAccount = new SavingsAccount(2);
		
		currentAccount.deposit(100);
		savingsAccount.deposit(100);
		
		savingsAccount.addInterest(2.75f);
		assertEquals("Interest rate changed unsuccessfully", 2.75f, savingsAccount.getInterestRate(), 0.01);
		savingsAccount.addInterest(-3);
		assertEquals("Interest rate is negative", 2.75f, savingsAccount.getInterestRate(), 0.01);
		
		currentAccount.setOverdraftLimit(50);
		assertEquals("Overdraft limit is positive", 0, currentAccount.getOverdraftLimit(), 0.01);
		currentAccount.setOverdraftLimit(-50);
		assertEquals("Overdraft limit changed unsuccessfully", -50, currentAccount.getOverdraftLimit(), 0.01);
		currentAccount.withdraw(150);
		assertEquals("Withdraw unsuccessful", -50, currentAccount.getBalance(), 0.01);
		currentAccount.withdraw(1);
		assertEquals("Passed the overdraft limit", -50, currentAccount.getBalance(), 0.01);
		
		
	}
	
}
