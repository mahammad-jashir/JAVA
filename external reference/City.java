class City {

    // static int puttur = 574239;
    // static int bantwal = 574232;
    // static int mumbai = 400001;
    // static int chennai = 600001;
    // static int kolkata = 700001;
    // static int hyderabad = 500001;
    // static int ahmedabad = 380001;
    // static int jaipur = 302001;
    // static int kochi = 682001;
    // static int bhubaneswar = 751001;
    // static int jalandhar = 144001;
    // static int lucknow = 226001;
    // static int ranchi = 834001;

    //static int pinCodes[] = {
        //puttur, bantwal, mumbai, chennai, kolkata, hyderabad,
       // ahmedabad, jaipur, kochi, bhubaneswar, jalandhar, lucknow, ranchi
   // };

    public static void main(String args[]) {

        int puttur = 574239;
        int bantwal = 574232;
        int mumbai = 400001;
        int chennai = 600001;
        int kolkata = 700001;
        int hyderabad = 500001;
        int ahmedabad = 380001;
        int jaipur = 302001;
        int kochi = 682001;
        int bhubaneswar = 751001;
        int jalandhar = 144001;
        int lucknow = 226001;
        int ranchi = 834001;

        int codes[] = {
            puttur, bantwal, mumbai, chennai, kolkata, hyderabad,
            ahmedabad, jaipur, kochi, bhubaneswar, jalandhar, lucknow, ranchi
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== City Pin Codes ===");

        for (int code : codes) {
            System.out.println(code);
        }

        System.out.println("--------------main ended--------------");
    }
}
