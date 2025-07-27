class Politician {

    int politicianId;
    String name;
    String party;
    String position;
    int age;
    String constituency;
    boolean isActive;

    Politician() {
        System.out.println("Politician Default Constructor Invoked ------------------");
    }

    Politician(int politicianId, String name, String party, String position, int age, String constituency, boolean isActive) {
        System.out.println("Politician Parameterized Constructor Invoked");
        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.position = position;
        this.age = age;
        this.constituency = constituency;
        this.isActive = isActive;
    }

    public void getInfo() {
        System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Position: " + position);
        System.out.println("Age: " + age);
        System.out.println("Constituency: " + constituency);
        System.out.println("Is Active: " + isActive);
        System.out.println("---------------------------------------------------");
    }
}
