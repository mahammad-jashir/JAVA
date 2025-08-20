package com.xworkz.lokhsabha.app;

public class Politician {

    private String name;
    private String party;
    private String constituency;
    private int age;
    private int experience;     // in years
    private boolean isMinister;
    private String contactNumber;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }
    public void setParty(String party) {
        this.party = party;
    }

    public String getConstituency() {
        return constituency;
    }
    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isMinister() {
        return isMinister;
    }
    public void setMinister(boolean isMinister) {
        this.isMinister = isMinister;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
