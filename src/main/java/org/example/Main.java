package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        var saving1 = new SavingAccount(16,0.04);
        var saving2 = new SavingAccount(20,2.03);
        var saving3 = new SavingAccount(35,0.04);

        var checkingAcc1 = new CheckingAccount(100_000,10);
        var checkingAcc2 = new CheckingAccount(156_000,15);
        var checkingAcc3 = new CheckingAccount(256_000,15);
        List<Account> accounts = new ArrayList<>();
        accounts.add(saving1);
        accounts.add(saving2);
        accounts.add(saving3);
        accounts.add(checkingAcc1);
        accounts.add(checkingAcc2);
        accounts.add(checkingAcc3);


        for (Account account : accounts) {
            System.out.println(account.calculateInterest());
        }

    }
}