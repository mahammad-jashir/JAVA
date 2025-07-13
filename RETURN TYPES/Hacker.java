class Hacker {
    static String alias;
    static boolean isWhiteHat;
    static int toolsUsed;
    static char rank;
    static float successRate;

    public static String getAlias() {
        alias = "Shadow";
        return alias;
    }
    public static boolean isWhiteHat() {
        isWhiteHat = false;
        return isWhiteHat;
    }
    public static int getToolsUsed() {
        toolsUsed = 12;
        return toolsUsed;
    }
    public static char getRank() {
        rank = 'A';
        return rank;
    }
    public static float getSuccessRate() {
        successRate = 87.5f;
        return successRate;
    }
}
