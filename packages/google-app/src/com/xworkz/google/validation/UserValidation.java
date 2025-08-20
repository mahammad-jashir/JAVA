package com.xworkz.google.validation;

import com.xworkz.google.user.UserAccount;

public class UserValidation {
    public UserAccount userAccount;

    public boolean createUserAccount (UserAccount userAccount){
        boolean userAccountCreated=false;

        boolean  firstnameValid=false;
        boolean  lastNameValid=false;
        boolean  dobValid=false;
        boolean  genderValid=false;
        boolean  gmailValid=false;
        boolean  passwordValid=false;
        boolean  cPasswordValid=false;

    if(userAccount.getFirstname()!=null) {
        firstnameValid = true;
    }else System.out.println("invalid");

    if(userAccount.getLastName()!=null){
        lastNameValid=true;
    }else System.out.println("Invalid");

    if(userAccount.getDob()!=null) {
            dobValid = true;
        }else System.out.println("invalid");
        if(userAccount.getGender()!=null) {
            genderValid = true;
        }else System.out.println("invalid");

        if(userAccount.getGmail()!=null) {
            gmailValid = true;
        }else System.out.println("invalid");

        if(userAccount.getPassword()!=null) {
            passwordValid = true;
        }else System.out.println("invalid");

        if(userAccount.getcPassword()!=null) {
            cPasswordValid = true;
        }else System.out.println("invalid");




        return userAccountCreated;

    }
}
