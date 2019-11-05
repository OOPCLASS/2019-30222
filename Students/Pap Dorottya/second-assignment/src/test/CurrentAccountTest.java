package test;

import com.company.models.CurrentAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentAccountTest {
    public CurrentAccount account;

    @Before
    public void initialize() {
        account = new CurrentAccount(1, 50);
    }

    @Test
    public void withdraw() {
        double balance = 50;

        account.deposit(balance);
        assertEquals(account.getBalance(), balance, 0);

        double withdrawMoney = 10;
        account.withdraw(withdrawMoney);
        assertEquals(account.getBalance(), balance - withdrawMoney, 0);

        account.withdraw(1000);
        assertEquals(account.getBalance(), balance - withdrawMoney, 0);
    }
}