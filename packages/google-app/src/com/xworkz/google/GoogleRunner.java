package com.xworkz.google;

import com.xworkz.google.user.UserAccount;
import com.xworkz.google.validation.UserValidation;

import java.sql.SQLOutput;

public class GoogleRunner {
    public static void main(String[] args) {

        System.out.println("Main Started");
        UserAccount userAccount=new UserAccount();
        userAccount.setFirstname("Mahammad");
        userAccount.setLastName("Jashir");
        userAccount.setDob("08-05-2003");
        userAccount.setGender("Male");
        userAccount.setGmail("juvejash@gmail.com");
        userAccount.setPassword("12345");
        userAccount.setcPassword("12345");

        UserValidation userValidation=new UserValidation();
        userValidation.userAccount=userAccount;
        System.out.println("The Account Created Successfully");
        System.out.println("Main Ended");

    }
}
