package com.xworkz.lokhsabha;

import com.xworkz.lokhsabha.app.Politician;
import com.xworkz.lokhsabha.management.LokhSabha;

public class LokhSabhaRunner {
    public static void main(String[] args) {
        System.out.println("LokSabha Session Started...");

        Politician politician = new Politician();
        politician.setName("Arjun Kumar");
        politician.setParty("National Party");
        politician.setConstituency("Bangalore North");
        politician.setAge(45);
        politician.setExperience(12);
        politician.setMinister(true);
        politician.setContactNumber("9876543210");

        LokhSabha lokSabha = new LokhSabha();
        boolean added = lokSabha.addPolitician(politician);
        System.out.println("Politician added: " + added);

        if (added) {
            lokSabha.getPoliticianInfo();
        }
    }
}
