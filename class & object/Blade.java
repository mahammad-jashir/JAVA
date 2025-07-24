class Blade {
    int bladeId;
    String brand;
    String material;
    int sharpnessLevel;
    double lengthInCm;
    boolean isReusable;
    String type;

public void GetInfo(){

        System.out.println("Blade ID: " + bladeId);
        System.out.println("Brand: " +brand);
        System.out.println("Material: " + material);
        System.out.println("Sharpness Level: " + sharpnessLevel);
        System.out.println("Length: " + lengthInCm + " cm");
        System.out.println("Reusable: " + isReusable);
        System.out.println("Type: " + type);
}
}