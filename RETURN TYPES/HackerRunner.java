class HackerRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String alias = Hacker.getAlias();
        boolean whiteHat = Hacker.isWhiteHat();
        int tools = Hacker.getToolsUsed();
        char rank = Hacker.getRank();
        float success = Hacker.getSuccessRate();

        System.out.println("Alias: " + alias);
        System.out.println("Is White Hat: " + whiteHat);
        System.out.println("Tools Used: " + tools);
        System.out.println("Rank: " + rank);
        System.out.println("Success Rate: " + success);
    }
}
