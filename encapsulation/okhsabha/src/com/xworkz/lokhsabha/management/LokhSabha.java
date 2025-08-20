package com.xworkz.lokhsabha.management;

import com.xworkz.lokhsabha.PoliticianValidator.PoliticianValidator;
import com.xworkz.lokhsabha.app.Politician;

public class LokhSabha {
    private Politician politician;

    public boolean addPolitician(Politician politician) {
        boolean added = false;

        PoliticianValidator validator = new PoliticianValidator();
        boolean isValid = validator.validatePolitician(politician);

        if (isValid) {
            this.politician = politician;
            added = true;
        }
        return added;
    }

    public void getPoliticianInfo() {
        System.out.println("Politician Name: " + politician.getName());
        System.out.println("Party: " + politician.getParty());
        System.out.println("Constituency: " + politician.getConstituency());
        System.out.println("Age: " + politician.getAge());
        System.out.println("Experience: " + politician.getExperience() + " years");
        System.out.println("Minister: " + (politician.isMinister() ? "Yes" : "No"));
        System.out.println("Contact: " + politician.getContactNumber());
    }
}
