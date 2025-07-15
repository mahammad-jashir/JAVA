class UberEats {

    static double price;

    public static double getPrice(String foodName) {
        if (foodName == "Cheeseburger") {
            price = 179.00;
        } else if (foodName == "Veggie Wrap") {
            price = 149.00;
        } else if (foodName == "Chicken Nuggets") {
            price = 129.00;
        } else if (foodName == "Tacos") {
            price = 119.00;
        } else if (foodName == "Falafel") {
            price = 139.00;
        } else if (foodName == "Milkshake") {
            price = 89.00;
        } else if (foodName == "Waffle") {
            price = 99.00;
        } else if (foodName == "Croissant") {
            price = 75.00;
        } else if (foodName == "Brownie") {
            price = 95.00;
        } else if (foodName == "Smoothie") {
            price = 110.00;
        } else {
            System.out.println("Invalid food name on UberEats");
        }
        return price;
    }
}
