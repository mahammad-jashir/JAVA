class DisneyLand {
    static String country;
    static int rides;
    static float area;
    static boolean isOpen;
    static long visitors;

    public static String getCountry() {
        country = "USA";
        return country;
    }
    public static int getRides() {
        rides = 60;
        return rides;
    }
    public static float getArea() {
        area = 85.6f;
        return area;
    }
    public static boolean isOpenToday() {
        isOpen = true;
        return isOpen;
    }
    public static long getVisitors() {
        visitors = 25000000L;
        return visitors;
    }
}
