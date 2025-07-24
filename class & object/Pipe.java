class Pipe {

    int pipeId;
    String material;
    double length;
    double diameter;
    boolean isFlexible;
    String manufacturer;
    double price;

    public void GetInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Diameter: " + diameter);
        System.out.println("Is Flexible: " + isFlexible);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
    }
}