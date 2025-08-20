package com.xworkz.passportseva.seva;

import com.xworkz.passportseva.user.PassportUser;

public class PassportSeva {
    public PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;

        boolean cpvLocationValid = false;
        boolean addressValid = false;
        boolean givenNameValid = false;
        boolean emailIdValid = false;
        boolean isSameEmailIdValid = false;
        boolean passwordValid = false;
        boolean cPasswordValid = false;
        boolean hintQuesValid = false;
        boolean hintAnsValid = false;
        boolean captchaValid = false;

        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("The location is invalid");
        }
        if (passportUser.getAddress() != null) {
            addressValid = true;
        } else {
            System.out.println("The address is invalid");
        }
        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("The given Name is Invalid");
        }
        if (passportUser.getEmailId() != null) {
            emailIdValid = true;
        } else {
            System.out.println("The emailid is Invalid");
        }
        if (passportUser.getIsSameEmailId() != false) {
            isSameEmailIdValid = true;
        } else {
            System.out.println("The  emaild is not same ");
        }
        if (passportUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("Not valid");
        }
        if (passportUser.getcPassword() != null) {
            cPasswordValid = true;
        } else {
            System.out.println("not valid");
        }
        if (passportUser.getHintQues() != null) {
            hintQuesValid = true;
        } else System.out.println("Not Valid");

        if (passportUser.getHintAns() != null) {
            hintAnsValid = true;
        } else System.out.println("Not Valid");

        if (passportUser.getCaptcha() != null) {
            captchaValid = true;
        } else System.out.println("Not Valid");
        return passportUserCreated;
    }
}