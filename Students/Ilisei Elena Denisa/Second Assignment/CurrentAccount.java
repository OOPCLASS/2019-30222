package com.company;

public class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(int number, double overdraftLimit) {
        super(number);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double sum) {
        if (super.getBalance() + overdraftLimit < sum){
            System.out.println("Insufficient funds");
            super.withdraw(sum);
        }else {
            super.withdraw(sum);
        }

    }

    public boolean overdraftLimitExceeded(){
        if((this.getBalance() < 0) && ((-this.getBalance()) > this.overdraftLimit)){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Current Account " + super.getAccountNumber() + ": " + "balance = " +  super.getBalance() +
                " overdraft limit = " + this.overdraftLimit;

    }
}
