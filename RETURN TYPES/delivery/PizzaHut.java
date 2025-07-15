class PizzaHut {

    static double price;

    public static double getPrice(String foodName) {
        if (foodName == "Classic Cheese Pizza") {
            price = 189.00;
        } else if (foodName == "Veggie Supreme") {
            price = 279.00;
        } else if (foodName == "Chicken Sausage Pizza") {
            price = 299.00;
        } else if (foodName == "Stuffed Crust") {
            price = 319.00;
        } else if (foodName == "Garlic Breadsticks") {
            price = 109.00;
        } else if (foodName == "Choco Volcano Cake") {
            price = 99.00;
        } else if (foodName == "Tandoori Paneer Pizza") {
            price = 269.00;
        } else if (foodName == "Cold Coffee") {
            price = 89.00;
        } else if (foodName == "Cheesy Pasta") {
            price = 199.00;
        } else if (foodName == "Lemonade") {
            price = 59.00;
        } else {
            System.out.println("Invalid food name on PizzaHut");
        }
        return price;
    }
}
