package com.xworkz.store;

import com.xworkz.store.app.Application;
import com.xworkz.store.playstore.PlayStore;
import com.xworkz.store.validator.AppValidator;

public class PlayStoreRunner {
    public static void main(String[] args) {
        System.out.println("Main started...");

        Application application = new Application();
        application.setApplicationId("1");
        application.setAppName("Instagram");
        application.setAppVersion("390.20.1");
        application.setDownloads(5000000000L);
        application.setOfferedBy("Meta");
        application.setUpdateOn("11/08/2025");
        application.setReleasedOn("Aug 2012");
        application.setRequiredOs("Android 9.0");

        PlayStore playStore = new PlayStore();
        boolean applicationAdded = playStore.addApplication(application);
        System.out.println("Application added: " + applicationAdded);

        if (applicationAdded) {
            playStore.getUserInfo();
        }
    }
}
