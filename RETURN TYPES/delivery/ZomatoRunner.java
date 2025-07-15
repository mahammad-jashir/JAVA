class ZomatoRunner {
    public static void main(String[] args) {
        String foodName = "Biryani";
        double price = Zomato.getPrice(foodName);
        System.out.println("The food price on Zomato is ₹" + price);
    }
}
