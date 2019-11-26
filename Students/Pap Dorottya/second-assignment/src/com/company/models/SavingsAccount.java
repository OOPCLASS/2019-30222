package com.company.models;

import com.company.models.common.Account;

public class SavingsAccount extends Account {
    private int interest;

    public SavingsAccount(int number, int interest) {
        super(number);
        this.interest = interest;
    }

    public void update() {
        double interestValue = getInterestValue();
        this.deposit(interestValue);
    }

    public double getInterestValue() {
        return (this.getBalance() * interest) / 100;
    }

    @Override
    public String toString() {
        return "Savings" + super.toString() + "; interest = " + interest;
    }
}
