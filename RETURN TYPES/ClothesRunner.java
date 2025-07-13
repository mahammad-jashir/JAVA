class ClothesRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = Clothes.getBrand();
        char size = Clothes.getSize();
        int price = Clothes.getPrice();
        boolean isNew = Clothes.isNewArrival();
        byte quantity = Clothes.getQuantity();

        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Is New Arrival: " + isNew);
        System.out.println("Quantity: " + quantity);
    }
}
