class Tyre {
    static String brand;
    static float diameter;
    static boolean isTubeless;
    static int warrantyYears;
    static double price;

    public static String getBrand() {
        brand = "APOLLO";
        return brand;
    }
    public static float getDiameter() {
        diameter = 22.5f;
        return diameter;
    }
    public static boolean isTubelessTyre() {
        isTubeless = true;
        return isTubeless;
    }
    public static int getWarrantyYears() {
        warrantyYears = 5;
        return warrantyYears;
    }
    public static double getPrice() {
        price = 4500.0;
        return price;
    }
}
