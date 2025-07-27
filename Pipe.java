class Pipe {



    Pipe() {
        System.out.println("Pipe Default Constructor Invoked ------------------");
    }

    Pipe(int pipeId, String material, double length, double diameter, boolean isFlexible, String manufacturer, double price) {
        System.out.println("Pipe Parameterized Constructor Invoked");
        this.pipeId = pipeId;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.isFlexible = isFlexible;
        this.manufacturer = manufacturer;
        this.price = price;
    }
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
        System.out.println("Length: " + length + " meters");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Is Flexible: " + isFlexible);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------------------------------");
    }
}
