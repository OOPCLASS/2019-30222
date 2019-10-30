package com.company;

public class Bank {

    private Account[] bankAccounts = new Account[100];
    private int bankAccountIndex = 0;

    public void TestAccounts() {
        bankAccounts[0] = new Account(1);
        bankAccounts[1] = new SavingsAccount(2);
        bankAccounts[2] = new CurrentAccount(3);
        bankAccountIndex += 3;
    }

    public void update() {
        for (Account bankAccount : bankAccounts) {
            if (bankAccount instanceof SavingsAccount) {
                ((SavingsAccount) bankAccount).addInterestRate(5d);
            } else if (bankAccount instanceof CurrentAccount) {
                if (((CurrentAccount) bankAccount).inOverdraft()) {
                    sendLetter(bankAccount);
                }
            }
        }
    }

    public void openAccount(int number) {
        bankAccounts[bankAccountIndex] = new Account(number);
        bankAccountIndex += 1;
    }

    public void closeAccount(int number) {
        for(Account bankAccount : bankAccounts) {
            if(bankAccount.getAccountNumber() == number) {
                bankAccount = null;
            }
        }
    }

    public void sendLetter(Account bankAccount) {
    }
}

