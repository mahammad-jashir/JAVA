package com.xworkz.institute.app;

public class Trainee {
    private String traineeId;
    private String name;
    private String course;
    private int age;
    private String email;
    private String phone;
    private String batch;
    private double feesPaid;


    public String getTraineeId() {
        return traineeId;
    }
    public void setTraineeId(String traineeId) {
        this.traineeId = traineeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getFeesPaid() {
        return feesPaid;
    }
    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }
}
