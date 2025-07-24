class Politician {

    int politicianId;
    String name;
    String party;
    String position;
    int age;
    String constituency;
    boolean isActive;

    public void getInfo() {
        System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Position: " + position);
        System.out.println("Age: " + age);
        System.out.println("Constituency: " + constituency);
        System.out.println("Is Active: " + isActive);
    }
}
