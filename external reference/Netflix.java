class Netflix {

    // static String kantharam = "KANTHARAM";
    // static String kgf1 = "KGF-1";
    // static String kgf2 = "KGF-2";
    // static String mungaruMale = "MUNGARU MALE";
    // static String sshh = "SSHH";
    // static String charlie = "CHARLIE";
    // static String kirikParty = "KIRIK PARTY";
    // static String hostelHudgru = "HOSTEL HUDGRU";
    // static String boss = "BOSS";
    // static String dia = "DIA";

    //static String sandalWood[] = {
       // kantharam, kgf1, kgf2, mungaruMale, sshh,
     //   charlie, kirikParty, hostelHudgru, boss, dia
    //};

    

    static String mollyWood[] = {"BIG B", "MARCO", "PADAKKALAM", "MINNAL MURULI", "THUDARUM", "ALAPPUZHA GYMKHANA", "CHOOTA MUMBAI", "PREMAM", "HELLO", "ADU JEEVITHAM"};
    static String kollyWood[] = {"GOAT", "VIKRAM", "THERI", "LEO", "JAILER", "KATHI", "KAITHI", "JILLA", "COBRA", "GILLI"};
    static String tollyWood[] = {"BAHUBALI-1", "BAHUBALI-2", "PUSHPA-1", "ARYA-2", "SAAHO", "RRR", "SALAAR", "MAGADHEERA", "PUSHPA-1", "SEETHA RAMAM"};
    static String bollyWood[] = {"ASHIQUEE-1", "ASHIQUEE-2", "LOVEAAAJKAL", "SIKANDAR", "HOUSEFULL-1", "HOUSEFULL-2", "CHENNAI EXPRESS", "PATHAAN", "WAR", "BABY"};
    static String hollyWood[] = {"CIVIL WAR", "INFINITY WAR", "END GAME", "AVENGERS", "IRON MAN", "AGE OF ULTRON", "BALLERINA", "YOUR PLACE OR MINE", "FINAL DSTINATION", "KISSING BOOTH"};
    static String webSeries[] = {"SQUID GAME", "STRANGER THINGS", "HALF PAST LOVE", "DEAD LINE", "WEDNESDAY", "THE LAST OF US", "YOU", "ANDOR", "THE BEAR", "SEVERSNCE"};

    public static void main(String[] movies) {

        String kantharam = "KANTHARAM";
        String kgf1 = "KGF-1";
        String kgf2 = "KGF-2";
        String mungaruMale = "MUNGARU MALE";
        String sshh = "SSHH";
        String charlie = "CHARLIE";
        String kirikParty = "KIRIK PARTY";
        String hostelHudgru = "HOSTEL HUDGRU";
        String boss = "BOSS";
        String dia = "DIA";

        String swMovies[] = {
            kantharam, kgf1, kgf2, mungaruMale, sshh,
            charlie, kirikParty, hostelHudgru, boss, dia
        };

        System.out.println("-------------main started-------------");

        System.out.println("== SANDALWOOD ==");
        for (String movie : swMovies) {
            System.out.println(movie);
        }

        System.out.println("== MOLLYWOOD ==");
        for (String movie : mollyWood) {
            System.out.println(movie);
        }

        System.out.println("== KOLLYWOOD ==");
        for (String movie : kollyWood) {
            System.out.println(movie);
        }

        System.out.println("== TOLLYWOOD ==");
        for (String movie : tollyWood) {
            System.out.println(movie);
        }

        System.out.println("== BOLLYWOOD ==");
        for (String movie : bollyWood) {
            System.out.println(movie);
        }

        System.out.println("== HOLLYWOOD ==");
        for (String movie : hollyWood) {
            System.out.println(movie);
        }

        System.out.println("== WEB SERIES ==");
        for (String series : webSeries) {
            System.out.println(series);
        }

        System.out.println("--------------main ended--------------");
    }
}
