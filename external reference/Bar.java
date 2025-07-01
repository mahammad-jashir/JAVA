class Bar {

    // static String whiskey = "WHISKEY";
    // static String vodka = "VODKA";
    // static String rum = "RUM";
    // static String gin = "GIN";
    // static String tequila = "TEQUILA";
    // static String brandy = "BRANDY";
    // static String beer = "BEER";
    // static String wine = "WINE";
    // static String scotch = "SCOTCH";
    // static String champagne = "CHAMPAGNE";
    // static String absinthe = "ABSINTHE";
    // static String cognac = "COGNAC";

    //static String alcoholNames[] = {
      //  whiskey, vodka, rum, gin, tequila, brandy,
     //   beer, wine, scotch, champagne, absinthe, cognac
   // };

    public static void main(String args[]) {

        String whiskey = "WHISKEY";
        String vodka = "VODKA";
        String rum = "RUM";
        String gin = "GIN";
        String tequila = "TEQUILA";
        String brandy = "BRANDY";
        String beer = "BEER";
        String wine = "WINE";
        String scotch = "SCOTCH";
        String champagne = "CHAMPAGNE";
        String absinthe = "ABSINTHE";
        String cognac = "COGNAC";

        String barMenu[] = {
            whiskey, vodka, rum, gin, tequila, brandy,
            beer, wine, scotch, champagne, absinthe, cognac
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Alcohol Names ===");

        for (String item : barMenu) {
            System.out.println(item);
        }

        System.out.println("--------------main ended--------------");
    }
}
