package com.xworkz.bankaccount;

public class BankRunner {
    public static void main(String[] args) {

        BankAccount myAccount=new BankAccount();
        myAccount.credit(30000);

        BankAccount friendAccount=new BankAccount();
        myAccount.transfer(friendAccount,10000);

        System.out.println("the available balance in my account is: "+myAccount.getBalance());
        System.out.println("the available balance in friend account is: "+friendAccount.getBalance());
    }
}
