package com.company;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(int number) {
        super(number);
    }

    @Override
    public void withdraw(double sum) {
        if (getBalance() - overdraftLimit >= sum) {
            super.withdraw(sum);
        } else {
            System.err.println("CurrentAccount.withdraw(...): cannot withdraw overdraftLimit passed.");
        }
    }

    public void setOverdraftLimit(double overdraftLimit) {
        if(overdraftLimit<=0) {
            this.overdraftLimit = overdraftLimit;
        } else {
            System.err.println("CurrentAccount.setOverdraftLimit(...): cannot set overdraftLimit, can't be higher than 0");
        }

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public boolean inOverdraft() {
        return getBalance() < 0;
    }
}
