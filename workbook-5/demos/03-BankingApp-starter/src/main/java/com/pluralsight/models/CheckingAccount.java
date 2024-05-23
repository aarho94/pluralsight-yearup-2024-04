package com.pluralsight.models;

public class CheckingAccount extends BankAccount {
    private static final double MAX_OVERDRAFT = 500.0;

    public CheckingAccount(int accountNumber, String owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    public boolean canWithdraw(double amount) {
        return balance + MAX_OVERDRAFT >= amount;
    }
}
