package com.xworkz.project;

import com.xworkz.project.app.Project;
import com.xworkz.project.management.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("Company project management started...");

        Project project = new Project();
        project.setProjectId("P101");
        project.setName("Coffee Bean Sorter AI");
        project.setDomain("Machine Learning");
        project.setBudget(500000);
        project.setClientName("Nasco Mobiles");
        project.setTeamSize(8);
        project.setDuration("6 months");
        project.setStatus("In Progress");

        Company company = new Company();
        boolean added = company.addProject(project);
        System.out.println("Project added: " + added);

        if (added) {
            company.getProjectInfo();
        }
    }
}
