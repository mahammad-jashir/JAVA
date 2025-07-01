class Hotel {

    // static String starters = "Starters";
    // static String soups = "Soups";
    // static String salads = "Salads";
    // static String sandwiches = "Sandwiches";
    // static String burgers = "Burgers";
    // static String pizza = "Pizza";
    // static String pasta = "Pasta";
    // static String biryani = "Biryani";
    // static String rice = "Rice";
    // static String chinese = "Chinese";
    // static String tandoori = "Tandoori Specials";
    // static String grilled = "Grilled Items";
    // static String seafood = "Seafood";
    // static String roti = "Roti";
    // static String breads = "Breads";
    // static String dips = "Dips & Sauces";
    // static String desserts = "Desserts";
    // static String iceCreams = "Ice Creams";
    // static String milkshakes = "Milkshakes";
    // static String beverages = "Beverages";
    // static String juices = "Juices";
    // static String mocktails = "Mocktails";
    // static String combos = "Combos";
    // static String breakfast = "Breakfast";
    // static String specials = "Specials";

    //static String Menu[] = {
       // starters, soups, salads, sandwiches, burgers, pizza, pasta, biryani,
        //rice, chinese, tandoori, grilled, seafood, roti, breads, dips, desserts,
       // iceCreams, milkshakes, beverages, juices, mocktails, combos, breakfast, specials
    //};

    public static void main(String menudetails[]) {

        String starters = "Starters";
        String soups = "Soups";
        String salads = "Salads";
        String sandwiches = "Sandwiches";
        String burgers = "Burgers";
        String pizza = "Pizza";
        String pasta = "Pasta";
        String biryani = "Biryani";
        String rice = "Rice";
        String chinese = "Chinese";
        String tandoori = "Tandoori Specials";
        String grilled = "Grilled Items";
        String seafood = "Seafood";
        String roti = "Roti";
        String breads = "Breads";
        String dips = "Dips & Sauces";
        String desserts = "Desserts";
        String iceCreams = "Ice Creams";
        String milkshakes = "Milkshakes";
        String beverages = "Beverages";
        String juices = "Juices";
        String mocktails = "Mocktails";
        String combos = "Combos";
        String breakfast = "Breakfast";
        String specials = "Specials";

        String items[] = {
            starters, soups, salads, sandwiches, burgers, pizza, pasta, biryani,
            rice, chinese, tandoori, grilled, seafood, roti, breads, dips, desserts,
            iceCreams, milkshakes, beverages, juices, mocktails, combos, breakfast, specials
        };

        System.out.println("-------------main started----------");
        System.out.println("============= MENU =============");

        for (String menuItem : items) {
            System.out.println(menuItem);
        }

        System.out.println("--------------main ended------------");
    }
}
