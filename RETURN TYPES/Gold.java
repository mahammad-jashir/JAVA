class Gold {
    static String type;
    static float weight;
    static double price;
    static boolean isPure;
    static char karat;

    public static String getType() {
        type = "Necklace";
        return type;
    }
    public static float getWeight() {
        weight = 24.5f;
        return weight;
    }
    public static double getPrice() {
        price = 150000.75;
        return price;
    }
    public static boolean isPureGold() {
        isPure = true;
        return isPure;
    }
    public static char getKarat() {
        karat = 'K';
        return karat;
    }
}
