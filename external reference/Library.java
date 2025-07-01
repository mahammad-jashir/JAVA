class Library {

    // static String wingsOfFire = "WINGS OF FIRE";
    // static String theAlchemist = "THE ALCHEMIST";
    // static String nineteenEightyFour = "1984";
    // static String richDadPoorDad = "RICH DAD POOR DAD";
    // static String fortyRulesOfLove = "FOURTY RULES OF LOVE";
    // static String monkFerrari = "THE MONK WHO SOLD HIS FERRARI";
    // static String sapiens = "SAPIENS";
    // static String thinkAndGrowRich = "THINK AND GROW RICH";

    //static String bookNames[] = {
       // wingsOfFire, theAlchemist, nineteenEightyFour, richDadPoorDad,
        //fortyRulesOfLove, monkFerrari, sapiens, thinkAndGrowRich
    //};

    public static void main(String args[]) {

        String wingsOfFire = "WINGS OF FIRE";
        String theAlchemist = "THE ALCHEMIST";
        String nineteenEightyFour = "1984";
        String richDadPoorDad = "RICH DAD POOR DAD";
        String fortyRulesOfLove = "FOURTY RULES OF LOVE";
        String monkFerrari = "THE MONK WHO SOLD HIS FERRARI";
        String sapiens = "SAPIENS";
        String thinkAndGrowRich = "THINK AND GROW RICH";

        String availableBooks[] = {
            wingsOfFire, theAlchemist, nineteenEightyFour, richDadPoorDad,
            fortyRulesOfLove, monkFerrari, sapiens, thinkAndGrowRich
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Library Books ===");

        for (String book : availableBooks) {
            System.out.println(book);
        }

        System.out.println("--------------main ended--------------");
    }
}
