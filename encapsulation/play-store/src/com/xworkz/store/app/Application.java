package com.xworkz.store.app;

public class Application {

    private String appName;
    private String appVersion;
    private String applicationId;
    private String updateOn;
    private long downloads;
    private String requiredOs;
    private String offeredBy;
    private String releasedOn;

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getApplicationId() {
        return applicationId;
    }
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getUpdateOn() {
        return updateOn;
    }
    public void setUpdateOn(String updateOn) {
        this.updateOn = updateOn;
    }

    public long getDownloads() {
        return downloads;
    }
    public void setDownloads(long downloads) {
        this.downloads = downloads;
    }

    public String getRequiredOs() {
        return requiredOs;
    }
    public void setRequiredOs(String requiredOs) {
        this.requiredOs = requiredOs;
    }

    public String getOfferedBy() {
        return offeredBy;
    }
    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public String getReleasedOn() {
        return releasedOn;
    }
    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;
    }
}







