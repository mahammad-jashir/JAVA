class King {
   
    King() {
        System.out.println("King Default Constructor Invoked ------------------");
    }

    King(int kingId, String name, String kingdom, String reignPeriod, boolean isFamous, String weapon, String dynasty) {
        System.out.println("King Parameterized Constructor Invoked");
        this.kingId = kingId;
        this.name = name;
        this.kingdom = kingdom;
        this.reignPeriod = reignPeriod;
        this.isFamous = isFamous;
        this.weapon = weapon;
        this.dynasty = dynasty;
    }

    int kingId;
    String name;
    String kingdom;
    String reignPeriod;
    boolean isFamous;
    String weapon;
    String dynasty;

    public void getInfo() {
        System.out.println("King ID: " + kingId);
        System.out.println("Name: " + name);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Period: " + reignPeriod);
        System.out.println("Is Famous: " + isFamous);
        System.out.println("Weapon: " + weapon);
        System.out.println("Dynasty: " + dynasty);
        System.out.println("---------------------------------------------------");
    }
}
