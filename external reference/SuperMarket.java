class SuperMarket {

    // static String v = "VANILLA";
    // static String c = "CHOCOLATE";
    // static String m = "MANGO";
    // static String k = "KULFI";
    // static String o = "OREO";
    // static String s = "STRAWBERRY";
    // static String p = "PISTA";
    // static String ca = "CARAMEL";
    // static String b = "BUTTERSCOTCH";
    // static String bc = "BLACKCURRANT";

    // static String axe = "AXE";
    // static String fogg = "FOGG";
    // static String denver = "DENVER";
    // static String skinn = "SKINN";
    // static String ws = "WILD STONE";
    // static String beardo = "BEARDO";
    // static String nivea = "NIVEA";
    // static String yardley = "YARDLEY";
    // static String engage = "ENGAGE";
    // static String luxure = "LUXURE";

    // static String rice = "RICE";
    // static String wheat = "WHEAT";
    // static String sugar = "SUGAR";
    // static String oil = "OIL";
    // static String tea = "TEA";
    // static String daal = "DAAL";
    // static String spices = "SPICES";
    // static String soap = "SOAP";
    // static String salt = "SALT";
    // static String flour = "FLOUR";

    // static String lipstick = "LIPSTICK";
    // static String foundation = "FOUNDATION";
    // static String kajal = "KAJAL";
    // static String mascara = "MASCARA";
    // static String nail = "NAIL POLISH";
    // static String cream = "CREAM";
    // static String lotion = "LOTION";
    // static String serum = "SERUM";
    // static String blush = "BLUSH";
    // static String eyeliner = "EYELINER";

    //static String iceCreams[] = {v, c, m, k, o, s, p, ca, b, bc};
    //static String perfumes[] = {axe, fogg, denver, skinn, ws, beardo, //nivea, yardley, //engage, luxure};
    //static String groceries[] = {rice, wheat, sugar, oil, tea, daal, //spices, soap, salt, //flour};
    //static String cosmetics[] = {lipstick, foundation, kajal, mascara, //nail, cream, //lotion, serum, blush, eyeliner};

    public static void main(String args[]) {
 
        String v = "VANILLA";
        String c = "CHOCOLATE";
        String m = "MANGO";
        String k = "KULFI";
        String o = "OREO";
        String s = "STRAWBERRY";
        String p = "PISTA";
        String ca = "CARAMEL";
        String b = "BUTTERSCOTCH";
        String bc = "BLACKCURRANT";
String iceCreams[] = {v, c, m, k, o, s, p, ca, b, bc};
 

        String axe = "AXE";
        String fogg = "FOGG";
        String denver = "DENVER";
        String skinn = "SKINN";
        String ws = "WILD STONE";
        String beardo = "BEARDO";
        String nivea = "NIVEA";
        String yardley = "YARDLEY";
        String engage = "ENGAGE";
        String luxure = "LUXURE";
String perfumes[] = {axe, fogg, denver, skinn, ws, beardo, nivea, yardley, engage, luxure};
 
        String rice = "RICE";
        String wheat = "WHEAT";
        String sugar = "SUGAR";
        String oil = "OIL";
        String tea = "TEA";
        String daal = "DAAL";
        String spices = "SPICES";
        String soap = "SOAP";
        String salt = "SALT";
        String flour = "FLOUR";
String groceries[] = {rice, wheat, sugar, oil, tea, daal, spices, soap, salt, flour};

        String lipstick = "LIPSTICK";
        String foundation = "FOUNDATION";
        String kajal = "KAJAL";
        String mascara = "MASCARA";
        String nail = "NAIL POLISH";
        String cream = "CREAM";
        String lotion = "LOTION";
        String serum = "SERUM";
        String blush = "BLUSH";
        String eyeliner = "EYELINER";
 String cosmetics[] = {lipstick, foundation, kajal, mascara, nail, cream, lotion, serum, blush, eyeliner};


        System.out.println("-------------main started-------------");

        System.out.println("=== Ice Creams ===");
        for (String ice : iceCreams) {
            System.out.println(ice);
        }

        System.out.println("=== Perfumes ===");
        for (String perf : perfumes) {
            System.out.println(perf);
        }

        System.out.println("=== Groceries ===");
        for (String item : groceries) {
            System.out.println(item);
        }

        System.out.println("=== Cosmetics ===");
        for (String cos : cosmetics) {
            System.out.println(cos);
        }

        System.out.println("--------------main ended--------------");
    }
}
