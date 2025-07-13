class River {
    static String name;
    static float length;
    static boolean isClean;
    static int statesCovered;
    static double depth;

    public static String getName() {
        name = "Yamuna";
        return name;
    }
    public static float getLength() {
        length = 2525.5f;
        return length;
    }
    public static boolean isCleanRiver() {
        isClean = false;
        return isClean;
    }
    public static int getStatesCovered() {
        statesCovered = 5;
        return statesCovered;
    }
    public static double getDepth() {
        depth = 32.5;
        return depth;
    }
}
