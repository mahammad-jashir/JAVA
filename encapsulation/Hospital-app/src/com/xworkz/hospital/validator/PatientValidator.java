package com.xworkz.hospital.validator;

import com.xworkz.hospital.app.Patient;

public class PatientValidator {
    public boolean validatePatientInfo(Patient patient) {
        boolean validated = false;

        boolean idValid = false;
        boolean nameValid = false;
        boolean ageValid = false;
        boolean genderValid = false;
        boolean diseaseValid = false;
        boolean admittedOnValid = false;
        boolean doctorValid = false;
        boolean contactValid = false;

        if (patient.getPatientId() != null && !patient.getPatientId().isEmpty()) {
            idValid = true;
        } else System.out.println("Invalid patient ID");

        if (patient.getName() != null && !patient.getName().isEmpty()) {
            nameValid = true;
        } else System.out.println("Invalid patient name");

        if (patient.getAge() > 0 && patient.getAge() < 100) {
            ageValid = true;
        } else System.out.println("Invalid patient age");

        if (patient.getGender() != null && !patient.getGender().isEmpty()) {
            genderValid = true;
        } else System.out.println("Invalid gender");

        if (patient.getDisease() != null && !patient.getDisease().isEmpty()) {
            diseaseValid = true;
        } else System.out.println("Invalid disease");

        if (patient.getAdmittedOn() != null && !patient.getAdmittedOn().isEmpty()) {
            admittedOnValid = true;
        } else System.out.println("Invalid admitted date");

        if (patient.getDoctorAssigned() != null && !patient.getDoctorAssigned().isEmpty()) {
            doctorValid = true;
        } else System.out.println("Invalid doctor assigned");

        if (patient.getContactNumber() != null && patient.getContactNumber().matches("\\d{10}")) {
            contactValid = true;
        } else System.out.println("Invalid contact number");

        if (idValid && nameValid && ageValid && genderValid && diseaseValid
                && admittedOnValid && doctorValid && contactValid) {
            validated = true;
        }

        return validated;
    }
}
