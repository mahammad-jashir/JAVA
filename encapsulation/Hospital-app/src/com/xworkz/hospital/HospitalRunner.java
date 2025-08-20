package com.xworkz.hospital;

import com.xworkz.hospital.app.Patient;
import com.xworkz.hospital.management.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Hospital system started...");

        Patient patient = new Patient();
        patient.setPatientId("P01");
        patient.setName("Sujay");
        patient.setAge(22);
        patient.setGender("Male");
        patient.setDisease("Fever");
        patient.setAdmittedOn("17/08/2025");
        patient.setDoctorAssigned("Dr. Mehta");
        patient.setContactNumber("9876543210");

        Hospital hospital = new Hospital();
        boolean admitted = hospital.admitPatient(patient);
        System.out.println("Patient admitted: " + admitted);

        if (admitted) {
            hospital.getPatientInfo();
        }
    }
}
