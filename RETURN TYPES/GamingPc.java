class GamingPc {
    static String brand;
    static int ram;
    static boolean hasRGB;
    static double price;
    static byte usbPorts;

    public static String getBrand() {
        brand = "TrakinPc";
        return brand;
    }
    public static int getRam() {
        ram = 32;
        return ram;
    }
    public static boolean hasRGBLights() {
        hasRGB = true;
        return hasRGB;
    }
    public static double getPrice() {
        price = 150000.99;
        return price;
    }
    public static byte getUsbPorts() {
        usbPorts = 6;
        return usbPorts;
    }
}
