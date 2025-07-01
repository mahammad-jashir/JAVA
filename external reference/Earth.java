class Earth {

    // static String asia = "ASIA";
    // static String africa = "AFRICA";
    // static String northAmerica = "NORTH AMERICA";
    // static String southAmerica = "SOUTH AMERICA";
    // static String antarctica = "ANTARCTICA";
    // static String europe = "EUROPE";
    // static String australia = "AUSTRALIA";

    //static String continents[] = {
        //asia, africa, northAmerica, southAmerica, antarctica, europe, australia
   // };

    public static void main(String args[]) {

        String asia = "ASIA";
        String africa = "AFRICA";
        String northAmerica = "NORTH AMERICA";
        String southAmerica = "SOUTH AMERICA";
        String antarctica = "ANTARCTICA";
        String europe = "EUROPE";
        String australia = "AUSTRALIA";

        String earthContinents[] = {
            asia, africa, northAmerica, southAmerica, antarctica, europe, australia
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Continents ===");

        for (String continent : earthContinents) {
            System.out.println(continent);
        }

        System.out.println("--------------main ended--------------");
    }
}
