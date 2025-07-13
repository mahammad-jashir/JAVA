class Banner {
    static String message;
    static int height;
    static int width;
    static boolean isDigital;
    static char colorCode;

    public static String getMessage() {
        message = "Welcome Home";
        return message;
    }
    public static int getHeight() {
        height = 6;
        return height;
    }
    public static int getWidth() {
        width = 3;
        return width;
    }
    public static boolean isDigitalBanner() {
        isDigital = false;
        return isDigital;
    }
    public static char getColorCode() {
        colorCode = 'R';
        return colorCode;
    }
}
