class PlayStation {

    // static String godOfWar = "GOD OF WAR";
    // static String fifa = "FIFA";
    // static String callOfDuty = "CALL OF DUTY";
    // static String spiderman = "SPIDERMAN";
    // static String fortnite = "FORTNITE";
    // static String minecraft = "MINECRAFT";
    // static String gta = "GTA V";
    // static String uncharted = "UNCHARTED";
    // static String batman = "BATMAN";
    // static String nfs = "NEED FOR SPEED";

    //static String games[] = {
        //godOfWar, fifa, callOfDuty, spiderman, fortnite,
       // minecraft, gta, uncharted, batman, nfs
   // };

    public static void main(String args[]) {

        String godOfWar = "GOD OF WAR";
        String fifa = "FIFA";
        String callOfDuty = "CALL OF DUTY";
        String spiderman = "SPIDERMAN";
        String fortnite = "FORTNITE";
        String minecraft = "MINECRAFT";
        String gta = "GTA V";
        String uncharted = "UNCHARTED";
        String batman = "BATMAN";
        String nfs = "NEED FOR SPEED";

        String psGames[] = {
            godOfWar, fifa, callOfDuty, spiderman, fortnite,
            minecraft, gta, uncharted, batman, nfs
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== PlayStation Games ===");

        for (String game : psGames) {
            System.out.println(game);
        }

        System.out.println("--------------main ended--------------");
    }
}
