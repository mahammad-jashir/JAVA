class Market {
    static String name;
    static int shops;
    static boolean isOpen;
    static double area;
    static short dailyVisitors;

    public static String getName() {
        name = "City Mall";
        return name;
    }
    public static int getShops() {
        shops = 100;
        return shops;
    }
    public static boolean isOpenNow() {
        isOpen = true;
        return isOpen;
    }
    public static double getArea() {
        area = 12000.75;
        return area;
    }
    public static short getDailyVisitors() {
        dailyVisitors = 4500;
        return dailyVisitors;
    }
}
