package com.company.models;

import com.company.models.common.Account;

public class CurrentAccount extends Account {
    private int overdraftLimit;

    public CurrentAccount(int number, int overdraftLimit) {
        super(number);
        this.overdraftLimit = overdraftLimit;
    }

    public void informLetter() {
        if (isOverdraftLimitExceeded()) {
            printLetter();
        }
    }

    public boolean isOverdraftLimitExceeded() {
        return this.getBalance() < -this.overdraftLimit;
    }

    private void printLetter() {
        System.out.println("CurrentAccount: " + this.getAccountNumber() + " has exceeded the limit!");
    }

    @Override
    public void withdraw(double sum) {
        if (!isOverdraftLimitExceeded() && sum <= this.getBalance() + this.overdraftLimit) {
            super.withdraw(sum);
        }
    }

    @Override
    public String toString() {
        return "Current" + super.toString() + "; overdraftLimit = " + overdraftLimit;
    }
}
