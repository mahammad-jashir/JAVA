package com.xworkz.institute;

import com.xworkz.institute.app.Trainee;
import com.xworkz.institute.management.Institute;

public class InstitueRunner {
    public static void main(String[] args) {
        System.out.println("Institute trainee management started...");

        Trainee trainee = new Trainee();
        trainee.setTraineeId("TR001");
        trainee.setName("Mahammad Jashir");
        trainee.setCourse("Java Full Stack");
        trainee.setAge(24);
        trainee.setEmail("jashir@gmail.com");
        trainee.setPhone("9876543210");
        trainee.setBatch("Batch-25");
        trainee.setFeesPaid(25000);

        Institute institute = new Institute();
        boolean added = institute.addTrainee(trainee);
        System.out.println("Trainee added: " + added);

        if (added) {
            institute.getTraineeInfo();
        }
    }
}
