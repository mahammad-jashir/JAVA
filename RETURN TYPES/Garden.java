class Garden {
    static String name;
    static double area;
    static boolean hasFountain;
    static int trees;
    static short benches;

    public static String getName() {
        name = "Green Park";
        return name;
    }
    public static double getArea() {
        area = 1500.0;
        return area;
    }
    public static boolean hasFountain() {
        hasFountain = true;
        return hasFountain;
    }
    public static int getTrees() {
        trees = 120;
        return trees;
    }
    public static short getBenches() {
        benches = 40;
        return benches;
    }
}
