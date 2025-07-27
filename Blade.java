class Blade {

    Blade() {
        System.out.println("Constructor Invoked------------------------------------");
    }

    Blade(int bladeId, String brand, String material, int sharpnessLevel, double lengthInCm, boolean isReusable, String type) {
        System.out.println("Blade parameter is invoked");
        this.bladeId = bladeId;
        this.brand = brand;
        this.material = material;
        this.sharpnessLevel = sharpnessLevel;
        this.lengthInCm = lengthInCm;
        this.isReusable = isReusable;
        this.type = type;
    }

    int bladeId;
    String brand;
    String material;
    int sharpnessLevel;
    double lengthInCm;
    boolean isReusable;
    String type;

    public void GetInfo() {
        System.out.println("Blade ID: " + bladeId);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Sharpness Level: " + sharpnessLevel);
        System.out.println("Length: " + lengthInCm + " cm");
        System.out.println("Reusable: " + isReusable);
        System.out.println("Type: " + type);
        System.out.println("----------------------------------");
    }
}

  