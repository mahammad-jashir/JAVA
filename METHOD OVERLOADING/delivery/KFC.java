class KFC {

    static double price;

    public static double search(String foodName) {
        if (foodName == "Zinger Burger") {
            price = 199.00;
            return price;
        } else if (foodName == "Popcorn Chicken") {
            price = 179.00;
            return price;
        } else if (foodName == "Chicken Bucket") {
            price = 399.00;
            return price;
        } else if (foodName == "Krusher") {
            price = 99.00;
            return price;
        } else if (foodName == "Rice Bowl") {
            price = 189.00;
            return price;
        } else if (foodName == "Chizza") {
            price = 229.00;
            return price;
        } else if (foodName == "French Fries") {
            price = 89.00;
            return price;
        } else if (foodName == "Paneer Zinger") {
            price = 209.00;
            return price;
        } else if (foodName == "Veg Rice Bowl") {
            price = 149.00;
            return price;
        } else if (foodName == "Pepsi") {
            price = 49.00;
            return price;
        } else if (foodName == "Fiery Grilled Chicken") {
            price = 229.00;
            return price;
        } else if (foodName == "Chicken Wings") {
            price = 169.00;
            return price;
        } else if (foodName == "Chicken Popcorn Large") {
            price = 239.00;
            return price;
        } else if (foodName == "Hot & Crispy Chicken") {
            price = 259.00;
            return price;
        } else if (foodName == "Chocolate Lava Cake") {
            price = 109.00;
            return price;
        } else if (foodName == "Coleslaw") {
            price = 59.00;
            return price;
        } else if (foodName == "Mini Chicken Bucket") {
            price = 279.00;
            return price;
        } else if (foodName == "Aloo Patty Wrap") {
            price = 129.00;
            return price;
        } else if (foodName == "Strips Meal") {
            price = 199.00;
            return price;
        } else if (foodName == "Biryani Box") {
            price = 249.00;
            return price;
        } else if (foodName == "Zinger Pro Burger") {
            price = 249.00;
            return price;
        } else if (foodName == "Smoky Red Chicken") {
            price = 289.00;
            return price;
        } else if (foodName == "Chicken Strips") {
            price = 159.00;
            return price;
        } else if (foodName == "Double Chicken Roll") {
            price = 189.00;
            return price;
        } else if (foodName == "Cheesy Fries") {
            price = 119.00;
            return price;
        } else if (foodName == "Classic Chicken Roll") {
            price = 139.00;
            return price;
        } else if (foodName == "7UP Can") {
            price = 45.00;
            return price;
        } else if (foodName == "Veg Zinger Box") {
            price = 179.00;
            return price;
        } else if (foodName == "Chicken Leg Piece") {
            price = 89.00;
            return price;
        } else if (foodName == "Combo Meal") {
            price = 349.00;
            return price;
        } else {
            System.out.println("Invalid food name on KFC");
        }
        return price;
    }
   public static double search(String foodName,int quantity) {
        if (foodName == "Zinger Burger") {
            price = 199.00 * quantity;
            return price;
        } else if (foodName == "Popcorn Chicken") {
            price = 179.00 * quantity;
            return price;
        } else if (foodName == "Chicken Bucket") {
            price = 399.00 * quantity;
            return price;
        } else if (foodName == "Krusher") {
            price = 99.00 * quantity;
            return price;
        } else if (foodName == "Rice Bowl") {
            price = 189.00 * quantity;
            return price;
        } else if (foodName == "Chizza") {
            price = 229.00 * quantity;
            return price;
        } else if (foodName == "French Fries") {
            price = 89.00 * quantity;
            return price;
        } else if (foodName == "Paneer Zinger") {
            price = 209.00 * quantity;
            return price;
        } else if (foodName == "Veg Rice Bowl") {
            price = 149.00 * quantity;
            return price;
        } else if (foodName == "Pepsi") {
            price = 49.00 * quantity;
            return price;
        } else if (foodName == "Fiery Grilled Chicken") {
            price = 229.00 * quantity;
            return price;
        } else if (foodName == "Chicken Wings") {
            price = 169.00 * quantity;
            return price;
        } else if (foodName == "Chicken Popcorn Large") {
            price = 239.00 * quantity;
            return price;
        } else if (foodName == "Hot & Crispy Chicken") {
            price = 259.00 * quantity;
            return price;
        } else if (foodName == "Chocolate Lava Cake") {
            price = 109.00 * quantity;
            return price;
        } else if (foodName == "Coleslaw") {
            price = 59.00 * quantity;
            return price;
        } else if (foodName == "Mini Chicken Bucket") {
            price = 279.00 * quantity;
            return price;
        } else if (foodName == "Aloo Patty Wrap") {
            price = 129.00 * quantity;
            return price;
        } else if (foodName == "Strips Meal") {
            price = 199.00 * quantity;
            return price;
        } else if (foodName == "Biryani Box") {
            price = 249.00 * quantity;
            return price;
        } else if (foodName == "Zinger Pro Burger") {
            price = 249.00 * quantity;
            return price;
        } else if (foodName == "Smoky Red Chicken") {
            price = 289.00 * quantity;
            return price;
        } else if (foodName == "Chicken Strips") {
            price = 159.00 * quantity;
            return price;
        } else if (foodName == "Double Chicken Roll") {
            price = 189.00 * quantity;
            return price;
        } else if (foodName == "Cheesy Fries") {
            price = 119.00 * quantity;
            return price;
        } else if (foodName == "Classic Chicken Roll") {
            price = 139.00 * quantity;
            return price;
        } else if (foodName == "7UP Can") {
            price = 45.00  * quantity;
            return price;
        } else if (foodName == "Veg Zinger Box") {
            price = 179.00 * quantity;
            return price;
        } else if (foodName == "Chicken Leg Piece") {
            price = 89.00 * quantity;
            return price;
        } else if (foodName == "Combo Meal") {
            price = 349.00 * quantity;
            return price;
        } else {
            System.out.println("Invalid food name on KFC");
        }
        return price;
}
}