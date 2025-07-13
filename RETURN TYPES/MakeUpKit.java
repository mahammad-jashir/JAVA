class MakeUpKit {
    static String brand;
    static int items;
    static boolean isWaterproof;
    static float weight;
    static double price;

    public static String getBrand() {
        brand = "Lakme";
        return brand;
    }
    public static int getItems() {
        items = 15;
        return items;
    }
    public static boolean isWaterproofKit() {
        isWaterproof = true;
        return isWaterproof;
    }
    public static float getWeight() {
        weight = 1.25f;
        return weight;
    }
    public static double getPrice() {
        price = 2999.99;
        return price;
    }
}
