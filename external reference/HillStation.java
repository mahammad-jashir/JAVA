class HillStation {

    // static String royalOrchid = "ROYAL ORCHID";
    // static String coorgResort = "COORG RESORT";
    // static String tajResort = "TAJ RESORT";
    // static String theIbnii = "THE IBNII";
    // static String hilltopHeaven = "HILLTOP HEAVEN";
    // static String himalayanVillage = "HIMALAYAN VILLAGE";
    // static String marriottResort = "MARTRIOTT RESORT";

    //static String resorts[] = {
      //  royalOrchid, coorgResort, tajResort,
      //  theIbnii, hilltopHeaven, himalayanVillage, marriottResort
   // };

    public static void main(String args[]) {

        String royalOrchid = "ROYAL ORCHID";
        String coorgResort = "COORG RESORT";
        String tajResort = "TAJ RESORT";
        String theIbnii = "THE IBNII";
        String hilltopHeaven = "HILLTOP HEAVEN";
        String himalayanVillage = "HIMALAYAN VILLAGE";
        String marriottResort = "MARTRIOTT RESORT";

        String bestResorts[] = {
            royalOrchid, coorgResort, tajResort,
            theIbnii, hilltopHeaven, himalayanVillage, marriottResort
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Hill Station Resorts ===");

        for (String resort : bestResorts) {
            System.out.println(resort);
        }

        System.out.println("--------------main ended--------------");
    }
}
