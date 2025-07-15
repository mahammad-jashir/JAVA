class PizzaHutRunner {
    public static void main(String[] args) {
        String foodName = "Veggie Supreme";
        double price = PizzaHut.getPrice(foodName);
        System.out.println("The food price on PizzaHut is ₹" + price);
    }
}
