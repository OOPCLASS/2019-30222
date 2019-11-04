package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        Bank myBank = new Bank(accounts);

        Account account1 = new Account(1000);
        account1.deposit(2000.0);
        account1.withdraw(200);

        SavingsAccount save1 = new SavingsAccount(1001, 1);
        save1.deposit(5000.0);
        save1.addInterest();
        //save1.print();

        CurrentAccount current1 = new CurrentAccount(1002, 200);
        current1.deposit(500);
        current1.withdraw(200);
        //current1.print();
        current1.withdraw(800);


        myBank.openAccount(account1);
        myBank.openAccount(save1);
        myBank.openAccount(current1);

        myBank.display();
        myBank.update();
        myBank.display();
        myBank.closeAccount(account1);
        myBank.display();
        myBank.payDivident(50.0);
        myBank.display();

    }

}
