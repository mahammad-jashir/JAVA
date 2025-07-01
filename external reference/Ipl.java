class Ipl {

    // static String csk = "CSK";
    // static String mi = "MI";
    // static String rcb = "RCB";
    // static String kkr = "KKR";
    // static String srh = "SRH";
    // static String rr = "RR";
    // static String dc = "DC";
    // static String pbks = "PBKS";
    // static String lsg = "LSG";
    // static String gt = "GT";

    //static String teamNames[] = {csk, mi, rcb, kkr, srh, rr, dc, pbks, lsg, gt};

    public static void main(String args[]) {

        String csk = "CSK";
        String mi = "MI";
        String rcb = "RCB";
        String kkr = "KKR";
        String srh = "SRH";
        String rr = "RR";
        String dc = "DC";
        String pbks = "PBKS";
        String lsg = "LSG";
        String gt = "GT";

        String teams[] = {csk, mi, rcb, kkr, srh, rr, dc, pbks, lsg, gt};

        System.out.println("-------------main started-------------");
        System.out.println("=== IPL Teams ===");

        for (String team : teams) {
            System.out.println(team);
        }

        System.out.println("--------------main ended--------------");
    }
}
