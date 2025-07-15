class Zomato {

    static double price;

    public static double getPrice(String foodName) {
        if (foodName == "Thali") {
            price = 120.00;
        } else if (foodName == "Biryani") {
            price = 250.00;
        } else if (foodName == "Paneer Butter Masala") {
            price = 199.00;
        } else if (foodName == "Butter Naan") {
            price = 40.00;
        } else if (foodName == "Tandoori Chicken") {
            price = 299.00;
        } else if (foodName == "Dosa") {
            price = 99.00;
        } else if (foodName == "Idli") {
            price = 60.00;
        } else if (foodName == "Vada Pav") {
            price = 30.00;
        } else if (foodName == "Masala Dosa") {
            price = 109.00;
        } else if (foodName == "Samosa") {
            price = 20.00;
        } else {
            System.out.println("Invalid food name on Zomato");
        }
        return price;
    }
}
