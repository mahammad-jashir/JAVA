class Hat {


    Hat() {
        System.out.println("Hat Default Constructor Invoked --------------------------");
    }

    Hat(int hatId, String type, String color, String material, double size, boolean isAdjustable, String brand) {
        System.out.println("Hat Parameterized Constructor Invoked");
        this.hatId = hatId;
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.isAdjustable = isAdjustable;
        this.brand = brand;
    }

    int hatId;
    String type;            
    String color;
    String material;        
    double size;            
    boolean isAdjustable;
    String brand;

    public void GetInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Brand: " + brand);
        System.out.println("--------------------------------------------------------");
    }
}
