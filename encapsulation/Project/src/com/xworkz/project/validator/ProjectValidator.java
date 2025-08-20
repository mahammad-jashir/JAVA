package com.xworkz.project.validator;

import com.xworkz.project.app.Project;

public class ProjectValidator {
    public boolean validateProject(Project project) {
        boolean validated = false;

        boolean idValid = false;
        boolean nameValid = false;
        boolean domainValid = false;
        boolean budgetValid = false;
        boolean clientValid = false;
        boolean teamValid = false;
        boolean durationValid = false;
        boolean statusValid = false;

        if (project.getProjectId() != null && !project.getProjectId().isEmpty()) {
            idValid = true;
        } else System.out.println("Invalid Project ID");

        if (project.getName() != null && !project.getName().isEmpty()) {
            nameValid = true;
        } else System.out.println("Invalid Project Name");

        if (project.getDomain() != null && !project.getDomain().isEmpty()) {
            domainValid = true;
        } else System.out.println("Invalid Project Domain");

        if (project.getBudget() >= 1000) {
            budgetValid = true;
        } else System.out.println("Invalid Project Budget");

        if (project.getClientName() != null && !project.getClientName().isEmpty()) {
            clientValid = true;
        } else System.out.println("Invalid Client Name");

        if (project.getTeamSize() > 0) {
            teamValid = true;
        } else System.out.println("Invalid Team Size");

        if (project.getDuration() != null && !project.getDuration().isEmpty()) {
            durationValid = true;
        } else System.out.println("Invalid Duration");

        if (project.getStatus() != null && !project.getStatus().isEmpty()) {
            statusValid = true;
        } else System.out.println("Invalid Status");

        if (idValid && nameValid && domainValid && budgetValid && clientValid &&
                teamValid && durationValid && statusValid) {
            validated = true;
        }

        return validated;
    }
}
