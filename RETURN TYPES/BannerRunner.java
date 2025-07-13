class BannerRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String msg = Banner.getMessage();
        int h = Banner.getHeight();
        int w = Banner.getWidth();
        boolean digital = Banner.isDigitalBanner();
        char color = Banner.getColorCode();

        System.out.println("Message: " + msg);
        System.out.println("Height: " + h);
        System.out.println("Width: " + w);
        System.out.println("Is Digital: " + digital);
        System.out.println("Color Code: " + color);
    }
}
