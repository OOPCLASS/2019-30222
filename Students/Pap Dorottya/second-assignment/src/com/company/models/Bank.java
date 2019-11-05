package com.company.models;

import com.company.models.common.Account;
import com.company.models.CurrentAccount;
import com.company.models.SavingsAccount;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank() {
        accounts.add(new Account(1));
        accounts.add(new SavingsAccount(2, 2));
        accounts.add(new SavingsAccount(3, 5));
        accounts.add(new CurrentAccount(10, 100));
        accounts.add(new CurrentAccount(30, 5));
    }

    public void update() {
        accounts.forEach(account -> {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).update();
            } else if (account instanceof CurrentAccount) {
                ((CurrentAccount) account).informLetter();
            }
        });
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accNumber);
    }

    public void payDividend(int money) {
        accounts.forEach(account -> account.deposit(money));
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
