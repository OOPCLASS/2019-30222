package com.company;

public class Main {

    public static void main(String[] args) {

        Account savingsAccount = new SavingsAccount(1);
        savingsAccount.deposit(4800.8);
        ((SavingsAccount)savingsAccount).addInterestRate(8.0d);

        Account currentAccount = new CurrentAccount(2);
        currentAccount.deposit(700.0);
        ((CurrentAccount)currentAccount).setOverdraftLimit(-100);
        ((CurrentAccount)currentAccount).withdraw(750);
    }
}
