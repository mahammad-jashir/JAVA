class KFCRunner {
    public static void main(String[] args) {
        String foodName = "Zinger Burger";
        double price = KFC.getPrice(foodName);
        System.out.println("The food price on KFC is ₹" + price);
    }
}
