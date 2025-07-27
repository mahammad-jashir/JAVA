class Marble {
    Marble() {
        System.out.println("Default constructor of Marble is called");
    }

    Marble(int marbleId, String color, double diameter, String material, String brand, boolean isCollectorItem, String pattern) {
        this.marbleId = marbleId;
        this.color = color;
        this.diameter = diameter;
        this.material = material;
        this.brand = brand;
        this.isCollectorItem = isCollectorItem;
        this.pattern = pattern;
    }

    int marbleId;
    String color;
    double diameter;
    String material;
    String brand;
    boolean isCollectorItem;
    String pattern;


    public void getInfo() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Color: " + color);
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Is Collector Item: " + isCollectorItem);
        System.out.println("Pattern: " + pattern);
        System.out.println("--------------------------------------");
    }
}
