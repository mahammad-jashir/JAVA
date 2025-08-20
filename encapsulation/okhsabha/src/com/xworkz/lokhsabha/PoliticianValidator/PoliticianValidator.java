package com.xworkz.lokhsabha.PoliticianValidator;

import com.xworkz.lokhsabha.app.Politician;

public class PoliticianValidator {
    public boolean validatePolitician(Politician politician) {
        boolean validated = false;

        boolean nameValid = false;
        boolean partyValid = false;
        boolean constituencyValid = false;
        boolean ageValid = false;
        boolean experienceValid = false;
        boolean contactValid = false;

        if (politician.getName() != null && !politician.getName().isEmpty()) {
            nameValid = true;
        } else System.out.println("Invalid Politician Name");

        if (politician.getParty() != null && !politician.getParty().isEmpty()) {
            partyValid = true;
        } else System.out.println("Invalid Party Name");

        if (politician.getConstituency() != null && !politician.getConstituency().isEmpty()) {
            constituencyValid = true;
        } else System.out.println("Invalid Constituency");

        if (politician.getAge() >= 25) { // minimum MP age
            ageValid = true;
        } else System.out.println("Invalid Age (must be >= 25)");

        if (politician.getExperience() >= 0) {
            experienceValid = true;
        } else System.out.println("Invalid Experience");

        if (politician.getContactNumber() != null && politician.getContactNumber().length() == 10) {
            contactValid = true;
        } else System.out.println("Invalid Contact Number");

        if (nameValid && partyValid && constituencyValid && ageValid && experienceValid && contactValid) {
            validated = true;
        }

        return validated;
    }
}
