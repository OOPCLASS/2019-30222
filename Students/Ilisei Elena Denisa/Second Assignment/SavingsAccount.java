package com.company;

public class SavingsAccount extends Account {
    private int interestRate;

    public SavingsAccount(int number, int interestRate) {
        super(number);
        this.interestRate = interestRate;
    }

    public int getInterest() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "Savings Account " + super.getAccountNumber() + ": " + "balance = " +  super.getBalance()
                + " interest = " + this.getInterest();
    }


    public void addInterest(){
        double sumAdded;
        sumAdded = ((double)this.interestRate / 100 * super.getBalance()) / 12;
        super.deposit(sumAdded);
    }

}
