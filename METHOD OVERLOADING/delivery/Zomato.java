class Zomato {

    static double price;

    public static double search(String foodName) {
       if (foodName == "Thali") {
            price = 120.00;
            return price;
        } else if (foodName == "Paneer Butter Masala") {
            price = 199.00;
            return price;
        } else if (foodName == "Butter Naan") {
            price = 40.00;
            return price;
        } else if (foodName == "Tandoori Chicken") {
            price = 299.00;
            return price;
        } else if (foodName == "Dosa") {
            price = 99.00;
	    return price;
        } else if (foodName == "Idli") {
            price = 60.00;
	    return price;
        } else if (foodName == "Vada Pav") {
            price = 30.00;
	    return price;
        } else if (foodName == "Masala Dosa") {
            price = 109.00;
	    return price;
        } else if (foodName == "Samosa") {
            price = 20.00;
	    return price;
        } else if (foodName == "Veg Pulao") {
            price = 129.00;
            return price;
        } else if (foodName == "Chicken Fry") {
            price = 259.00;
     	    return price;
        } else if (foodName == "Egg Curry") {
            price = 139.00;
	    return price;
        } else if (foodName == "Veg Manchurian") {
            price = 179.00;
            return price;
        } else if (foodName == "Gobi 65") {
            price = 159.00;
            return price;
        } else if (foodName == "Spring Roll") {
            price = 99.00;
	    return price;
        } else if (foodName == "Chilli Paneer") {
            price = 189.00;
	    return price;
        } else if (foodName == "Dal Fry") {
            price = 129.00;
	    return price;
        } else if (foodName == "Tamarind Rice") {
            price = 89.00;
	    return price;
        } else if (foodName == "Curd Rice") {
            price = 79.00;
    	    return price;
        } else if (foodName == "Roti") {
            price = 20.00;
	    return price;
        } else if (foodName == "Poori Bhaji") {
            price = 99.00;
            return price;
        } else if (foodName == "Upma") {
            price = 59.00;
            return price;
        } else if (foodName == "Poha") {
            price = 69.00;
            return price;
        } else if (foodName == "Vegetable Soup") {
            price = 89.00;
            return price;
        } else if (foodName == "Sweet Corn Soup") {
            price = 99.00;
	    return price;
        } else if (foodName == "Mushroom Curry") {
            price = 199.00;
	    return price;
        } else if (foodName == "Fish Curry") {
            price = 289.00;
            return price;
        } else if (foodName == "Chicken Lollipop") {
            price = 239.00;
            return price;
        } else if (foodName == "Rasgulla") {
            price = 59.00;
            return price;
        } else if (foodName == "Lassi") {
            price = 49.00;
            return price;
        } else {
            System.out.println("Invalid food name on Zomato");
        }
        return price;

    }
public static double search(String foodName, int quantity){

        if (foodName == "Thali") {
            price = 120.00 * quantity;
            return price;
        } else if (foodName == "Paneer Butter Masala") {
            price = 199.00 *quantity;
            return price;
        } else if (foodName == "Butter Naan") {
            price = 40.00;
            return price;
        } else if (foodName == "Tandoori Chicken") {
            price = 299.00;
            return price;
        } else if (foodName == "Dosa") {
            price = 99.00;
	    return price;
        } else if (foodName == "Idli") {
            price = 60.00;
	    return price;
        } else if (foodName == "Vada Pav") {
            price = 30.00;
	    return price;
        } else if (foodName == "Masala Dosa") {
            price = 109.00;
	    return price;
        } else if (foodName == "Samosa") {
            price = 20.00;
	    return price;
        } else if (foodName == "Veg Pulao") {
            price = 129.00;
            return price;
        } else if (foodName == "Chicken Fry") {
            price = 259.00;
     	    return price;
        } else if (foodName == "Egg Curry") {
            price = 139.00 *quantity;
	    return price;
        } else if (foodName == "Veg Manchurian") {
            price = 179.00;
            return price;
        } else if (foodName == "Gobi 65") {
            price = 159.00;
            return price;
        } else if (foodName == "Spring Roll") {
            price = 99.00;
	    return price;
        } else if (foodName == "Chilli Paneer") {
            price = 189.00;
	    return price;
        } else if (foodName == "Dal Fry") {
            price = 129.00;
	    return price;
        } else if (foodName == "Tamarind Rice") {
            price = 89.00;
	    return price;
        } else if (foodName == "Curd Rice") {
            price = 79.00;
    	    return price;
        } else if (foodName == "Roti") {
            price = 20.00;
	    return price;
        } else if (foodName == "Poori Bhaji") {
            price = 99.00;
            return price;
        } else if (foodName == "Upma") {
            price = 59.00;
            return price;
        } else if (foodName == "Poha") {
            price = 69.00;
            return price;
        } else if (foodName == "Vegetable Soup") {
            price = 89.00;
            return price;
        } else if (foodName == "Sweet Corn Soup") {
            price = 99.00;
	    return price;
        } else if (foodName == "Mushroom Curry") {
            price = 199.00;
	    return price;
        } else if (foodName == "Fish Curry") {
            price = 289.00;
            return price;
        } else if (foodName == "Chicken Lollipop") {
            price = 239.00;
            return price;
        } else if (foodName == "Rasgulla") {
            price = 59.00;
            return price;
        } else if (foodName == "Lassi") {
            price = 49.00;
            return price;
        } 
else {
            System.out.println("Invalid food name on Zomato");
        }
        return price;

}
}
