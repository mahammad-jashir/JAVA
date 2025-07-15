class UberEats {

    static double price;

    public static double search(String foodName) {
        if (foodName == "Cheeseburger") {
            price = 179.00;
            return price;
        } else if (foodName == "Veggie Wrap") {
            price = 149.00;
            return price;
        } else if (foodName == "Chicken Nuggets") {
            price = 129.00;
            return price;
        } else if (foodName == "Tacos") {
            price = 119.00;
            return price;
        } else if (foodName == "Falafel") {
            price = 139.00;
            return price;
        } else if (foodName == "Milkshake") {
            price = 89.00;
            return price;
        } else if (foodName == "Waffle") {
            price = 99.00;
            return price;
        } else if (foodName == "Croissant") {
            price = 75.00;
            return price;
        } else if (foodName == "Brownie") {
            price = 95.00;
            return price;
        } else if (foodName == "Smoothie") {
            price = 110.00;
            return price;
        } else if (foodName == "Churros") {
            price = 105.00;
            return price;
        } else if (foodName == "Panini") {
            price = 155.00;
            return price;
        } else if (foodName == "Burrito") {
            price = 175.00;
            return price;
        } else if (foodName == "Mac and Cheese") {
            price = 165.00;
            return price;
        } else if (foodName == "Chicken Sandwich") {
            price = 149.00;
            return price;
        } else if (foodName == "Beef Burger") {
            price = 189.00;
            return price;
        } else if (foodName == "Onion Rings") {
            price = 99.00;
            return price;
        } else if (foodName == "Caesar Salad") {
            price = 129.00;
            return price;
        } else if (foodName == "Garlic Bread") {
            price = 89.00;
            return price;
        } else if (foodName == "BBQ Wings") {
            price = 159.00;
            return price;
        } else if (foodName == "Hot Dog") {
            price = 109.00;
            return price;
        } else if (foodName == "Apple Pie") {
            price = 69.00;
            return price;
        } else if (foodName == "Ice Tea") {
            price = 49.00;
            return price;
        } else if (foodName == "Cappuccino") {
            price = 79.00;
            return price;
        } else if (foodName == "Latte") {
            price = 89.00;
            return price;
        } else if (foodName == "Espresso") {
            price = 59.00;
            return price;
        } else if (foodName == "Donut") {
            price = 45.00;
            return price;
        } else if (foodName == "Bagel") {
            price = 55.00;
            return price;
        } else if (foodName == "Frappe") {
            price = 95.00;
            return price;
        } else if (foodName == "Pancake") {
            price = 115.00;
            return price;
        }  else {
            System.out.println("Invalid food name on UberEats");
        }
        return price;
    }
public static double search(String foodName,int quantity) {
        if (foodName == "Cheeseburger") {
            price = 179.00 * quantity;
            return price;
        } else if (foodName == "Veggie Wrap") {
            price = 149.00 * quantity;
            return price;
        } else if (foodName == "Chicken Nuggets") {
            price = 129.00 * quantity;
            return price;
        } else if (foodName == "Tacos") {
            price = 119.00 * quantity;
            return price;
        } else if (foodName == "Falafel") {
            price = 139.00 * quantity;
            return price;
        } else if (foodName == "Milkshake") {
            price = 89.00 * quantity;
            return price;
        } else if (foodName == "Waffle") {
            price = 99.00 * quantity;
            return price;
        } else if (foodName == "Croissant") {
            price = 75.00 * quantity;
            return price;
        } else if (foodName == "Brownie") {
            price = 95.00 * quantity;
            return price;
        } else if (foodName == "Smoothie") {
            price = 110.00 * quantity;
            return price;
        } else if (foodName == "Churros") {
            price = 105.00 * quantity;
            return price;
        } else if (foodName == "Panini") {
            price = 155.00 * quantity;
            return price;
        } else if (foodName == "Burrito") {
            price = 175.00 * quantity;
            return price;
        } else if (foodName == "Mac and Cheese") {
            price = 165.00 * quantity;
            return price;
        } else if (foodName == "Chicken Sandwich") {
            price = 149.00 * quantity;
            return price;
        } else if (foodName == "Beef Burger") {
            price = 189.00 * quantity;
            return price;
        } else if (foodName == "Onion Rings") {
            price = 99.00 * quantity;
            return price;
        } else if (foodName == "Caesar Salad") {
            price = 129.00 * quantity;
            return price;
        } else if (foodName == "Garlic Bread") {
            price = 89.00 * quantity;
            return price;
        } else if (foodName == "BBQ Wings") {
            price = 159.00 * quantity;
            return price;
        } else if (foodName == "Hot Dog") {
            price = 109.00 * quantity;
            return price;
        } else if (foodName == "Apple Pie") {
            price = 69.00 * quantity;
            return price;
        } else if (foodName == "Ice Tea") {
            price = 49.00 * quantity;
            return price;
        } else if (foodName == "Cappuccino") {
            price = 79.00 * quantity;
            return price;
        } else if (foodName == "Latte") {
            price = 89.00 * quantity;
            return price;
        } else if (foodName == "Espresso") {
            price = 59.00 * quantity;
            return price;
        } else if (foodName == "Donut") {
            price = 45.00 * quantity;
            return price;
        } else if (foodName == "Bagel") {
            price = 55.00 * quantity;
            return price;
        } else if (foodName == "Frappe") {
            price = 95.00 * quantity;
            return price;
        } else if (foodName == "Pancake") {
            price = 115.00 * quantity;
            return price;
        }  else {
            System.out.println("Invalid food name on UberEats");
        }
        return price;
    }

}
