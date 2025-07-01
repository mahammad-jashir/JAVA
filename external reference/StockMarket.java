class StockMarket {

    // static String reliance = "RELIANCE";
    // static String pepe = "PEPE";
    // static String doge = "DOGE";
    // static String hdfc = "HDFC";
    // static String icici = "ICICI";
    // static String itc = "ITC";
    // static String wipro = "WIPRO";
    // static String ongc = "ONGC";
    // static String hindalco = "HINDALCO";
    // static String bhartiAirtel = "BHARTI AIRTEL";

    //static String stockNames[] = {
        //reliance, pepe, doge, hdfc, icici,
       // itc, wipro, ongc, hindalco, bhartiAirtel
  //  };

    public static void main(String args[]) {

        String reliance = "RELIANCE";
        String pepe = "PEPE";
        String doge = "DOGE";
        String hdfc = "HDFC";
        String icici = "ICICI";
        String itc = "ITC";
        String wipro = "WIPRO";
        String ongc = "ONGC";
        String hindalco = "HINDALCO";
        String bhartiAirtel = "BHARTI AIRTEL";

        String companies[] = {
            reliance, pepe, doge, hdfc, icici,
            itc, wipro, ongc, hindalco, bhartiAirtel
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Stock Market Companies ===");

        for (String stock : companies) {
            System.out.println(stock);  // ✅ fixed this line
        }

        System.out.println("--------------main ended--------------");
    }
}
