class Fish {
    

    Fish() {
        System.out.println("Default constructor of Fish is called");
    }

    Fish(int fishId, String species, String color, double length, double weight, String habitat, boolean isEndangered) {
        this.fishId = fishId;
        this.species = species;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.habitat = habitat;
        this.isEndangered = isEndangered;
    }

int fishId;
    String species;
    String color;
    double length;
    double weight;
    String habitat;
    boolean isEndangered;

    public void getInfo() {
        System.out.println("Fish ID: " + fishId);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Habitat: " + habitat);
        System.out.println("Is Endangered: " + isEndangered);
        System.out.println("----------------------------------");
    }
}
