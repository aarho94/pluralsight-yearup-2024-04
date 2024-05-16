package com.pluralsight;

import com.pluralsight.models.BankAccount;

public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 25.0;

    public SavingsAccount(int accountNumber, String owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    public boolean canWithdraw(double amount) {
        return balance - amount >= MIN_BALANCE;
    }
}


