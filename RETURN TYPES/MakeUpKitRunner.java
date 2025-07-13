class MakeUpKitRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = MakeUpKit.getBrand();
        int items = MakeUpKit.getItems();
        boolean waterproof = MakeUpKit.isWaterproofKit();
        float weight = MakeUpKit.getWeight();
        double price = MakeUpKit.getPrice();

        System.out.println("Brand: " + brand);
        System.out.println("Items: " + items);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
    }
}
