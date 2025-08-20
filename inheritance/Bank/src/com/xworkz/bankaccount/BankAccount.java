package com.xworkz.bankaccount;

public class BankAccount {
    private double balance;

    public double getBalance(){
        return balance;

    }
    public void credit(double amount){
        balance=balance+amount;
    }
    public void debit(double amount){
        balance=balance-amount;
    }
    public void transfer(BankAccount benificiaryAccount,double amount){

        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
}
