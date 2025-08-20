package com.xworkz.store.playstore;

import com.xworkz.store.app.Application;
import com.xworkz.store.validator.AppValidator;

public class PlayStore {

    private Application application;

    public boolean addApplication(Application application) {
        boolean applicationAdded = false;

        AppValidator appValidator = new AppValidator();
        boolean isApplicationValid = appValidator.validateApplicationInfo(application);

        if (isApplicationValid) {
            this.application = application;
            applicationAdded = true;
        }

        return applicationAdded;
    }

    public void getUserInfo() {
        System.out.println("App id: " + application.getApplicationId());
        System.out.println("App name: " + application.getAppName());
        System.out.println("App version: " + application.getAppVersion());
        System.out.println("App updated on: " + application.getUpdateOn());
        System.out.println("App Downloads: " + application.getDownloads());
        System.out.println("App required OS: " + application.getRequiredOs());
        System.out.println("App offered by: " + application.getOfferedBy());
        System.out.println("App released on: " + application.getReleasedOn());
    }
}