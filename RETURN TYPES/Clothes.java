class Clothes {
    static String brand;
    static char size;
    static int price;
    static boolean isNew;
    static byte quantity;

    public static String getBrand() {
        brand = "Zara";
        return brand;
    }
    public static char getSize() {
        size = 'M';
        return size;
    }
    public static int getPrice() {
        price = 2500;
        return price;
    }
    public static boolean isNewArrival() {
        isNew = true;
        return isNew;
    }
    public static byte getQuantity() {
        quantity = 3;
        return quantity;
    }
}
