class Bangalore {

    // static String madiwala = "MADIWALA";
    // static String indiranagar = "INDIRANAGAR";

    //static String areaNames[] = {
        //madiwala, indiranagar
//};

    public static void main(String args[]) {

        String madiwala = "MADIWALA";
        String indiranagar = "INDIRANAGAR";

        String areas[] = {
            madiwala, indiranagar
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Bangalore Areas ===");

        for (String area : areas) {
            System.out.println(area);
        }

        System.out.println("--------------main ended--------------");
    }
}
