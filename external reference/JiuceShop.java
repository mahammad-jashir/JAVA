class JiuceShop {

    // static String apple = "APPLE";
    // static String orange = "ORANGE";
    // static String mango = "MANGO";
    // static String grape = "GRAPE";
    // static String pineapple = "PINEAPPLE";
    // static String watermelon = "WATERMELON";
    // static String muskmelon = "MUSKMELON";
    // static String kiwi = "KIWI";
    // static String carrot = "CARROT";
    // static String beetroot = "BEETROOT";
    // static String guava = "GUAVA";
    // static String mixedFruit = "MIXED FRUIT";
    // static String pomegranate = "POMEGRANATE";
    // static String sugarcane = "SUGARCANE";
    // static String lemon = "LEMON";

    //static String juices[] = {
        //apple, orange, mango, grape, pineapple, watermelon, muskmelon, kiwi,
        //carrot, beetroot, guava, mixedFruit, pomegranate, sugarcane, lemon
    //};

    public static void main(String args[]) {

        String apple = "APPLE";
        String orange = "ORANGE";
        String mango = "MANGO";
        String grape = "GRAPE";
        String pineapple = "PINEAPPLE";
        String watermelon = "WATERMELON";
        String muskmelon = "MUSKMELON";
        String kiwi = "KIWI";
        String carrot = "CARROT";
        String beetroot = "BEETROOT";
        String guava = "GUAVA";
        String mixedFruit = "MIXED FRUIT";
        String pomegranate = "POMEGRANATE";
        String sugarcane = "SUGARCANE";
        String lemon = "LEMON";

        String availableJuices[] = {
            apple, orange, mango, grape, pineapple, watermelon, muskmelon, kiwi,
            carrot, beetroot, guava, mixedFruit, pomegranate, sugarcane, lemon
        };

        System.out.println("-------------main started-------------");
        System.out.println("=== Available Juices ===");

        for (String juice : availableJuices) {
            System.out.println(juice);
        }

        System.out.println("--------------main ended--------------");
    }
}
