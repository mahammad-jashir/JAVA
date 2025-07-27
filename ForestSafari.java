class ForestSafari {
    

    ForestSafari() {
        System.out.println("Default constructor of ForestSafari is called");
    }

    ForestSafari(int safariId, String forestName, String location, int durationHours,
                 int numberOfAnimalsSeen, String guideName, boolean isNightSafari) {
        this.safariId = safariId;
        this.forestName = forestName;
        this.location = location;
        this.durationHours = durationHours;
        this.numberOfAnimalsSeen = numberOfAnimalsSeen;
        this.guideName = guideName;
        this.isNightSafari = isNightSafari;
    }

int safariId;
    String forestName;
    String location;
    int durationHours;
    int numberOfAnimalsSeen;
    String guideName;
    boolean isNightSafari;

    public void getInfo() {
        System.out.println("Safari ID: " + safariId);
        System.out.println("Forest Name: " + forestName);
        System.out.println("Location: " + location);
        System.out.println("Duration (hours): " + durationHours);
        System.out.println("Number of Animals Seen: " + numberOfAnimalsSeen);
        System.out.println("Guide Name: " + guideName);
        System.out.println("Is Night Safari: " + isNightSafari);
        System.out.println("------------------------------------");
    }
}
