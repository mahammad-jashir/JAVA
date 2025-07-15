class UberEatsRunner {
    public static void main(String[] args) {
        String foodName = "Waffle";
        double price = UberEats.getPrice(foodName);
        System.out.println("The food price on UberEats is ₹" + price);
    }
}
