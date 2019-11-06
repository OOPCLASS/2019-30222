package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accountsList = new ArrayList<Account>();

    public Bank(ArrayList<Account> accountsList) {
        this.accountsList = accountsList;
    }

    public void openAccount(Account newAccount){
        this.accountsList.add(newAccount);
        System.out.println("Account no " + newAccount.getAccountNumber() + " succesfully added");
    }
    public void closeAccount(Account closeAccount){
        this.accountsList.remove(closeAccount);
        System.out.println("Account no " + closeAccount.getAccountNumber()  +" succesfully closed");
    }

    public void payDivident(double divident) {
        for (int i = 0; i < this.accountsList.size() ; i++) {
            this.accountsList.get(i).deposit(divident);
        }
    }
    public void update(){
        ArrayList<Account> list = this.accountsList;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass().getSimpleName().equals("SavingsAccount")) {
                SavingsAccount saveTemp = (SavingsAccount) list.get(i);
                saveTemp.addInterest();
            }
            else if(list.get(i).getClass().getSimpleName().equals("CurrentAccount")){
                CurrentAccount currentAccountTemp = (CurrentAccount) list.get(i);
                if(currentAccountTemp.overdraftLimitExceeded())
                    System.out.println("Overdraft letter sent -> account no:" + currentAccountTemp.getAccountNumber());
            }
        }
    }

    public void display(){
        System.out.println("List of accounts:");
        for (int i = 0; i < this.accountsList.size(); i++) {
            System.out.print((i+1) + ". " );
            this.accountsList.get(i).print();
        }
    }
}
