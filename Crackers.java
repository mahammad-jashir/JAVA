class Crackers {
    Crackers() {
        System.out.println("Crackers Default Constructor Invoked ------------------");
    }

    Crackers(int crackerId, String name, String type, double price, String color, boolean isLoud, String brand) {
        System.out.println("Crackers Parameterized Constructor Invoked");
        this.crackerId = crackerId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.color = color;
        this.isLoud = isLoud;
        this.brand = brand;
    }


    int crackerId;
    String name;
    String type;
    double price;
    String color;
    boolean isLoud;
    String brand;


    public void getInfo() {
        System.out.println("Cracker ID: " + crackerId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Is Loud: " + isLoud);
        System.out.println("Brand: " + brand);
        System.out.println("---------------------------------------------------");
    }
}
