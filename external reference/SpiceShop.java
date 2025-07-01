class SpiceShop {

    // static String turmeric = "TURMERIC";
    // static String cumin = "CUMIN";
    // static String coriander = "CORIANDER";
    // static String chilliPowder = "CHILLI POWDER";
    // static String blackPepper = "BLACK PEPPER";
    // static String cardamom = "CARDAMOM";
    // static String cinnamon = "CINNAMON";
    // static String clove = "CLOVE";
    // static String mustardSeed = "MUSTARD SEED";
    // static String fenugreek = "FENUGREEK";
    // static String asafoetida = "ASAFOETIDA";
    // static String bayLeaf = "BAY LEAF";
    // static String ginger = "GINGER";
    // static String garlic = "GARLIC";

    //static String spices[] = {
       // turmeric, cumin, coriander, chilliPowder, blackPepper, cardamom,
       // cinnamon, clove, mustardSeed, fenugreek, asafoetida, bayLeaf, ginger, garlic
    //};

    public static void main(String args[]) {

        String turmeric = "TURMERIC";
        String cumin = "CUMIN";
        String coriander = "CORIANDER";
        String chilliPowder = "CHILLI POWDER";
        String blackPepper = "BLACK PEPPER";
        String cardamom = "CARDAMOM";
        String cinnamon = "CINNAMON";
        String clove = "CLOVE";
        String mustardSeed = "MUSTARD SEED";
        String fenugreek = "FENUGREEK";
        String asafoetida = "ASAFOETIDA";
        String bayLeaf = "BAY LEAF";
        String ginger = "GINGER";
        String garlic = "GARLIC";

        String availableSpices[] = {
            turmeric, cumin, coriander, chilliPowder, blackPepper, cardamom,
            cinnamon, clove, mustardSeed, fenugreek, asafoetida, bayLeaf, ginger, garlic
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Spices ===");

        for (String spice : availableSpices) {
            System.out.println(spice);
        }

        System.out.println("--------------main ended--------------");
    }
}
