package com.xworkz.institute.validator;

import com.xworkz.institute.app.Trainee;

public class TraineeValidator {
    public boolean validateTrainee(Trainee trainee) {
        boolean validated = false;

        boolean idValid = false;
        boolean nameValid = false;
        boolean courseValid = false;
        boolean ageValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean batchValid = false;
        boolean feesValid = false;

        if (trainee.getTraineeId() != null && !trainee.getTraineeId().isEmpty()) {
            idValid = true;
        } else System.out.println("Invalid Trainee ID");

        if (trainee.getName() != null && !trainee.getName().isEmpty()) {
            nameValid = true;
        } else System.out.println("Invalid Trainee Name");

        if (trainee.getCourse() != null && !trainee.getCourse().isEmpty()) {
            courseValid = true;
        } else System.out.println("Invalid Course");

        if (trainee.getAge() > 15 && trainee.getAge() < 60) {
            ageValid = true;
        } else System.out.println("Invalid Age");

        if (trainee.getEmail() != null && trainee.getEmail().contains("@")) {
            emailValid = true;
        } else System.out.println("Invalid Email");

        if (trainee.getPhone() != null && trainee.getPhone().length() == 10) {
            phoneValid = true;
        } else System.out.println("Invalid Phone");

        if (trainee.getBatch() != null && !trainee.getBatch().isEmpty()) {
            batchValid = true;
        } else System.out.println("Invalid Batch");

        if (trainee.getFeesPaid() >= 0) {
            feesValid = true;
        } else System.out.println("Invalid Fees");

        if (idValid && nameValid && courseValid && ageValid &&
                emailValid && phoneValid && batchValid && feesValid) {
            validated = true;
        }

        return validated;
    }
}
