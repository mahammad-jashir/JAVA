package com.xworkz.passportseva;

import com.xworkz.passportseva.seva.PassportSeva;
import com.xworkz.passportseva.user.PassportUser;

public class PassportRunner {
    public static void main(String args[]){
        System.out.println("The main Started");
        PassportUser passportUser=new PassportUser();
        passportUser.setCpvLocation("PO");
        passportUser.setAddress("Manglore");
        passportUser.setGivenName("Mahammad Jashir");
        passportUser.setEmailId("juvejash@gmail.com");
        passportUser.setIsSameEmailId(true);
        passportUser.setPassword("12345");
        passportUser.setcPassword("12345");
        passportUser.setHintQues("give fav color");
        passportUser.setHintAns("black");
        passportUser.setCaptcha("CPu67");

        PassportSeva passportSeva=new PassportSeva();
        passportSeva.passportUser=passportUser;
        System.out.println("Account created successfully");
    }
}
