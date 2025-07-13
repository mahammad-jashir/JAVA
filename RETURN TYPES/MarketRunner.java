class MarketRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = Market.getName();
        int shops = Market.getShops();
        boolean open = Market.isOpenNow();
        double area = Market.getArea();
        short visitors = Market.getDailyVisitors();

        System.out.println("Market Name: " + name);
        System.out.println("Shops: " + shops);
        System.out.println("Is Open: " + open);
        System.out.println("Area: " + area);
        System.out.println("Daily Visitors: " + visitors);
    }
}
