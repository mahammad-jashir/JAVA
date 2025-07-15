class KFC {

    static double price;

    public static double getPrice(String foodName) {
        if (foodName == "Zinger Burger") {
            price = 199.00;
        } else if (foodName == "Popcorn Chicken") {
            price = 179.00;
        } else if (foodName == "Chicken Bucket") {
            price = 399.00;
        } else if (foodName == "Krusher") {
            price = 99.00;
        } else if (foodName == "Rice Bowl") {
            price = 189.00;
        } else if (foodName == "Chizza") {
            price = 229.00;
        } else if (foodName == "French Fries") {
            price = 89.00;
        } else if (foodName == "Paneer Zinger") {
            price = 209.00;
        } else if (foodName == "Veg Rice Bowl") {
            price = 149.00;
        } else if (foodName == "Pepsi") {
            price = 49.00;
        } else {
            System.out.println("Invalid food name on KFC");
        }
        return price;
    }
}
