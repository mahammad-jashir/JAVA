class Dominos {

    static double price;

    public static double getPrice(String foodName) {
        if (foodName == "Margherita Pizza") {
            price = 199.00;
        } else if (foodName == "Farmhouse Pizza") {
            price = 299.00;
        } else if (foodName == "Peppy Paneer") {
            price = 279.00;
        } else if (foodName == "Cheese Burst") {
            price = 319.00;
        } else if (foodName == "Choco Lava Cake") {
            price = 99.00;
        } else if (foodName == "Garlic Bread") {
            price = 129.00;
        } else if (foodName == "Taco Mexicana") {
            price = 159.00;
        } else if (foodName == "Paneer Parcel") {
            price = 89.00;
        } else if (foodName == "Pasta Italiano") {
            price = 189.00;
        } else if (foodName == "Cold Drink") {
            price = 60.00;
        } else {
            System.out.println("Invalid food name on Dominos");
        }
        return price;
    }
}
