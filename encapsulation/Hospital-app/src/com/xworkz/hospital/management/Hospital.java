package com.xworkz.hospital.management;

import com.xworkz.hospital.app.Patient;
import com.xworkz.hospital.validator.PatientValidator;

public class Hospital {
    private Patient patient;

    public boolean admitPatient(Patient patient) {
        boolean admitted = false;

        PatientValidator validator = new PatientValidator();
        boolean isValid = validator.validatePatientInfo(patient);

        if (isValid) {
            this.patient = patient;
            admitted = true;
        }

        return admitted;
    }

    public void getPatientInfo() {
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Disease: " + patient.getDisease());
        System.out.println("Admitted On: " + patient.getAdmittedOn());
        System.out.println("Doctor Assigned: " + patient.getDoctorAssigned());
        System.out.println("Contact Number: " + patient.getContactNumber());
    }
}

