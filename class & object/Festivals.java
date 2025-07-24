class Festivals {
    int festivalId;
    String festivalName;
    String country;
    String month;
    int durationDays;
    boolean isPublicHoliday;
    String significance;

    public void getInfo() {
        System.out.println("Festival ID: " + festivalId);
        System.out.println("Festival Name: " + festivalName);
        System.out.println("Country: " + country);
        System.out.println("Month: " + month);
        System.out.println("Duration (Days): " + durationDays);
        System.out.println("Is Public Holiday: " + isPublicHoliday);
        System.out.println("Significance: " + significance);
        System.out.println("----------------------------------");
    }
}
