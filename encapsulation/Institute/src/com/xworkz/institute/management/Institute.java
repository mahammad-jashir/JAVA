package com.xworkz.institute.management;

import com.xworkz.institute.app.Trainee;
import com.xworkz.institute.validator.TraineeValidator;

public class Institute {
 private Trainee trainee;

public boolean addTrainee(Trainee trainee) {
    boolean added = false;

    TraineeValidator validator = new TraineeValidator();
    boolean isValid = validator.validateTrainee(trainee);

    if (isValid) {
        this.trainee = trainee;
        added = true;
    }

    return added;
}

public void getTraineeInfo() {
    System.out.println("Trainee ID: " + trainee.getTraineeId());
    System.out.println("Name: " + trainee.getName());
    System.out.println("Course: " + trainee.getCourse());
    System.out.println("Age: " + trainee.getAge());
    System.out.println("Email: " + trainee.getEmail());
    System.out.println("Phone: " + trainee.getPhone());
    System.out.println("Batch: " + trainee.getBatch());
    System.out.println("Fees Paid: ₹" + trainee.getFeesPaid());
}
}
