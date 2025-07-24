class AmusementPark {

    int parkId;
    String name;
    String location;
    int noOfRides;
    boolean hasWaterPark;
    double entryFee;
    String openSeason;

    public void getInfo() {
        System.out.println("Park ID: " + parkId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Rides: " + noOfRides);
        System.out.println("Has Water Park: " + hasWaterPark);
        System.out.println("Entry Fee: " + entryFee);
        System.out.println("Open Season: " + openSeason);
        System.out.println("--------------------------------------");
    }
}
