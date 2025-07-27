class Casino {
    Casino() {
        System.out.println("Casino Default Constructor Invoked ------------------");
    }

    Casino(String casinoName, String location, int numberOfGames, boolean hasPokerRoom, int openingYear, double averageDailyVisitors, String ownerName) {
        System.out.println("Casino Parameterized Constructor Invoked");
        this.casinoName = casinoName;
        this.location = location;
        this.numberOfGames = numberOfGames;
        this.hasPokerRoom = hasPokerRoom;
        this.openingYear = openingYear;
        this.averageDailyVisitors = averageDailyVisitors;
        this.ownerName = ownerName;
    }

    String casinoName;
    String location;
    int numberOfGames;
    boolean hasPokerRoom;
    int openingYear;
    double averageDailyVisitors;
    String ownerName;


    public void getInfo() {
        System.out.println("Casino Name: " + casinoName);
        System.out.println("Location: " + location);
        System.out.println("Number of Games: " + numberOfGames);
        System.out.println("Has Poker Room: " + hasPokerRoom);
        System.out.println("Opening Year: " + openingYear);
        System.out.println("Average Daily Visitors: " + averageDailyVisitors);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("--------------------------------------");
    }
}
