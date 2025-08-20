package com.xworkz.project.management;

import com.xworkz.project.app.Project;
import com.xworkz.project.validator.ProjectValidator;

public class Company {
    private Project project;

    public boolean addProject(Project project) {
        boolean added = false;

        ProjectValidator validator = new ProjectValidator();
        boolean isValid = validator.validateProject(project);

        if (isValid) {
            this.project = project;
            added = true;
        }

        return added;
    }

    public void getProjectInfo() {
        System.out.println("Project ID: " + project.getProjectId());
        System.out.println("Project Name: " + project.getName());
        System.out.println("Domain: " + project.getDomain());
        System.out.println("Budget: ₹" + project.getBudget());
        System.out.println("Client: " + project.getClientName());
        System.out.println("Team Size: " + project.getTeamSize());
        System.out.println("Duration: " + project.getDuration());
        System.out.println("Status: " + project.getStatus());
    }
}
