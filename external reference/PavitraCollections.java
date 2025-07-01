class PavitraCollections {

    // static String zara = "ZARA";
    // static String levis = "LEVIS";
    // static String nike = "NIKE";
    // static String adidas = "ADIDAS";
    // static String puma = "PUMA";
    // static String allenSolly = "ALLEN SOLLY";
    // static String reload = "RELOAD";
    // static String zooni = "ZOONI";
    // static String hnm = "H&M";
    // static String veroModa = "VERO MODA";

    //static String brands[] = {
       // zara, levis, nike, adidas, puma,
      //  allenSolly, reload, zooni, hnm, veroModa
  //  };

    public static void main(String args[]) {

        String zara = "ZARA";
        String levis = "LEVIS";
        String nike = "NIKE";
        String adidas = "ADIDAS";
        String puma = "PUMA";
        String allenSolly = "ALLEN SOLLY";
        String reload = "RELOAD";
        String zooni = "ZOONI";
        String hnm = "H&M";
        String veroModa = "VERO MODA";

        String topBrands[] = {
            zara, levis, nike, adidas, puma,
            allenSolly, reload, zooni, hnm, veroModa
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Pavitra Collections Brands ===");

        for (String brand : topBrands) {
            System.out.println(brand);
        }

        System.out.println("--------------main ended--------------");
    }
}
