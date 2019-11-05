package test;

import com.company.models.SavingsAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SavingsAccountTest {
    public SavingsAccount account;

    @Before
    public void initialize() {
        account = new SavingsAccount(1, 2);
        account.deposit(10);
    }

    @Test
    public void update() {
        double interestValue = account.getInterestValue();
        double balance = account.getBalance();

        account.update();
        assertEquals(account.getBalance(), balance + interestValue, 0);
    }
}