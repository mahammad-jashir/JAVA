 class SuperMarket {

    static String iceCreams[] = {"VANILLA", "CHOCOLATE", "MANGO", "KULFI", "OREO", "STRAWBERRY", "PISTA", "CARAMEL", "BUTTERSCOTCH", "BLACKCURRANT"};
    static String perfumes [] = {"AXE", "FOGG", "DENVER", "SKINN", "WILD STONE", "BEARDO", "NIVEA", "YARDLEY", "ENGAGE", "LUXURE"};
    static String groceries[] = {"RICE", "WHEAT", "SUGAR", "OIL", "TEA", "DAAL", "SPICES", "SOAP", "SALT", "FLOUR"};
    static String cosmetics[] = {"LIPSTICK", "FOUNDATION", "KAJAL", "MASCARA", "NAIL POLISH", "CREAM", "LOTION", "SERUM", "BLUSH", "EYELINER"};

    public static void main(String args[]) {
        System.out.println("=== Ice Creams ===");
        for(String icecream :iceCreams){
System.out.println(icecream);
}

        System.out.println("=== Perfumes ===");
 for(String Perfumes :perfumes){
System.out.println(Perfumes);
}

                System.out.println("=== Groceries ===");
 for(String Groceries :groceries){
System.out.println(Groceries);
}

                System.out.println("=== Cosmetics ===");
 for(String Cosmetics :cosmetics){
System.out.println(Cosmetics);
}

            }
}
