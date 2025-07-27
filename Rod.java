class Rod {
    Rod() {
        System.out.println("Rod Default Constructor Invoked --------------------------");
    }

    Rod(int rodId, String material, double length, double diameter, double weight, boolean isHollow, String usage) {
        System.out.println("Rod Parameterized Constructor Invoked");
        this.rodId = rodId;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.weight = weight;
        this.isHollow = isHollow;
        this.usage = usage;
    }

    int rodId;
    String material;        
    double length;          
    double diameter;        
    double weight;          
    boolean isHollow;      
    String usage;



    public void GetInfo() {
        System.out.println("ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " m");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Hollow: " + isHollow);
        System.out.println("Usage: " + usage);
        System.out.println("------------------------------------------");
    }
}
