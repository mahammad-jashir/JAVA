package com.xworkz.store.validator;

import com.xworkz.store.app.Application;

public class AppValidator {

    public boolean validateApplicationInfo(Application application) {
        boolean appValidated = false;

        boolean isApplicationIdValid = false;
        boolean isAppNameValid = false;
        boolean isAppVersionValid = false;
        boolean updateOnValid = false;
        boolean downloadsValid = false;
        boolean requiredOsValid = false;
        boolean offeredByValid = false;
        boolean releasedOnValid = false;

        if (application.getApplicationId() != null && !application.getApplicationId().isEmpty()) {
            isApplicationIdValid = true;
        } else System.out.println("Not valid id");

        if (application.getAppName() != null && !application.getAppName().isEmpty()) {
            isAppNameValid = true;
        } else System.out.println("Not valid name");

        if (application.getAppVersion() != null && !application.getAppVersion().isEmpty()) {
            isAppVersionValid = true;
        } else System.out.println("Not valid version");

        if (application.getUpdateOn() != null && !application.getUpdateOn().isEmpty()) {
            updateOnValid = true;
        } else System.out.println("Not valid update date");

        if (application.getDownloads() > 0) {
            downloadsValid = true;
        } else System.out.println("Not valid downloads");

        if (application.getRequiredOs() != null && !application.getRequiredOs().isEmpty()) {
            requiredOsValid = true;
        } else System.out.println("Not valid required OS");

        if (application.getOfferedBy() != null && !application.getOfferedBy().isEmpty()) {
            offeredByValid = true;
        } else System.out.println("Not valid offeredBy");

        if (application.getReleasedOn() != null && !application.getReleasedOn().isEmpty()) {
            releasedOnValid = true;
        } else System.out.println("Not valid release date");

        if (isApplicationIdValid && isAppNameValid && isAppVersionValid && updateOnValid
                && downloadsValid && requiredOsValid && offeredByValid && releasedOnValid) {
            appValidated = true;
        }

        return appValidated;
    }
}

