package com.company;

public class SavingsAccount extends Account {

    private double interestRate = 0.0d;

    public SavingsAccount(int number) {
        super(number);
    }

    public void addInterestRate(double interestRate) {
        if (interestRate >= 0) {
            this.interestRate += interestRate;
        }
        else {
            System.err.println("SavingsAccount.addInterest(...): interestRate cannot be negative.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }
}
