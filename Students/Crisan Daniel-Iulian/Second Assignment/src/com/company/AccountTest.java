package com.company;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

    @Test
    public void testAccountOperations() {
        SavingsAccount savingsAccount = new SavingsAccount(1);
        CurrentAccount currentAccount = new CurrentAccount(2);

        savingsAccount.deposit(1000);
        currentAccount.deposit(1000);

        savingsAccount.addInterestRate(5d);
        assertEquals("Interest rate changed unsuccessfully", 5d, savingsAccount.getInterestRate(), 0.01);
        savingsAccount.addInterestRate(-3d);
        assertEquals("Interest rate is negative", 5d, savingsAccount.getInterestRate(), 0.01);

        currentAccount.setOverdraftLimit(-100);
        assertEquals("Overdraft limit is negative", 0, currentAccount.getOverdraftLimit(), 0.01);
        currentAccount.setOverdraftLimit(50);
        assertEquals("Overdraft limit changed unsuccessfully", 50, currentAccount.getOverdraftLimit(), 0.01);
        currentAccount.withdraw(1500);
        assertEquals("Withdraw unsuccessful", -500, currentAccount.getBalance(), 0.01);
        currentAccount.withdraw(1);
        assertEquals("Passed the overdraft limit", -500, currentAccount.getBalance(), 0.01);
    }
}
