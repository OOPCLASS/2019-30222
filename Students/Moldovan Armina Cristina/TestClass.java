package Tema;

//import org.junit.Assert;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestClass {
	@Test
	public void TestCls1()
	{
		Account account = new Account(0);
		account.deposit(58.8);
		assertEquals(58.8,account.getBalance());
	}
	@Test
	public void TestCls2()
	{
		Account account = new Account(0);
		account.deposit(58.8);
		assertNotEquals(58,account.getBalance());
	}
	@Test
	public void TestCls3()
	{
		Account account = new Account(100);
		account.deposit(100);
		account.withdraw(25.0);
		assertEquals(75,account.getBalance());
	}
	@Test
	public void TestCls4()
	{
		Account account = new Account(100);
		account.deposit(100);
		account.withdraw(23);
		assertEquals(77,account.getBalance());
	}
	@Test
	public void TestCls5()
	{
		Account account = new Account(100);
		account.deposit(100);
		account.withdraw(23);
		assertEquals(77,account.getBalance());
	}
	@Test
	public void TestCls6()
	{
		CurrentAccount currentAccount = new CurrentAccount(90);
		currentAccount.deposit(10);
		assertEquals(10,currentAccount.getBalance());
	}
	@Test
	public void TestCls7()
	{
		CurrentAccount currentAccount = new CurrentAccount(90);
		currentAccount.deposit(30);
		currentAccount.withdraw(2);
		assertEquals(28,currentAccount.getBalance());
	}
	@Test
	public void TestCls8()
	{
		SavingsAccount savingAccount = new SavingsAccount(90);
		savingAccount.deposit(30);
		assertEquals(30,savingAccount.getBalance());
	}
	@Test
	public void TestCls9()
	{
		SavingsAccount savingAccount = new SavingsAccount(90);
		savingAccount.deposit(30);
		savingAccount.withdraw(3);
		assertEquals(27,savingAccount.getBalance());
	}
}
