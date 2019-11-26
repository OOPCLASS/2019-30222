package test;

import com.company.models.Bank;
import com.company.models.common.Account;
import org.junit.Before;

import static org.junit.Assert.*;

public class BankTest {
    public Bank bank;

    @Before
    public void initialize() {
        bank = new Bank();
    }

    @org.junit.Test
    public void openAccount() {
        assertEquals(bank.getAccounts().size(), 5);
        bank.openAccount(new Account(101));
        assertEquals(bank.getAccounts().size(), 6);
    }

    @org.junit.Test
    public void closeAccount() {
        int accountNumber = 101;

        assertEquals(bank.getAccounts().size(), 5);
        bank.openAccount(new Account(accountNumber));
        assertEquals(bank.getAccounts().size(), 6);
        bank.closeAccount(accountNumber);
        assertEquals(bank.getAccounts().size(), 5);
    }

    @org.junit.Test
    public void payDividend() {
        bank.getAccounts()
            .forEach(account -> assertEquals(account.getBalance(), 0, 0));

        int dividendValue = 10;
        bank.payDividend(dividendValue);

        bank.getAccounts()
                .forEach(account -> assertEquals(account.getBalance(), dividendValue, 0));

    }
}