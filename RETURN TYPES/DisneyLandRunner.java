class DisneyLandRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String country = DisneyLand.getCountry();
        int rides = DisneyLand.getRides();
        float area = DisneyLand.getArea();
        boolean open = DisneyLand.isOpenToday();
        long visitors = DisneyLand.getVisitors();

        System.out.println("Country: " + country);
        System.out.println("Rides: " + rides);
        System.out.println("Area: " + area);
        System.out.println("Is Open: " + open);
        System.out.println("Visitors: " + visitors);
    }
}
