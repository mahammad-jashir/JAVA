package com.xworkz.hospital.app;

public class Patient {

    private String patientId;
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String admittedOn;
    private String doctorAssigned;
    private String contactNumber;

    // Getters & Setters
    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getAdmittedOn() {
        return admittedOn;
    }
    public void setAdmittedOn(String admittedOn) {
        this.admittedOn = admittedOn;
    }

    public String getDoctorAssigned() {
        return doctorAssigned;
    }
    public void setDoctorAssigned(String doctorAssigned) {
        this.doctorAssigned = doctorAssigned;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
