class GoldRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String type = Gold.getType();
        float weight = Gold.getWeight();
        double price = Gold.getPrice();
        boolean pure = Gold.isPureGold();
        char karat = Gold.getKarat();

        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Is Pure: " + pure);
        System.out.println("Karat: " + karat);
    }
}
