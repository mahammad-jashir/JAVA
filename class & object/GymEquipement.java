class GymEquipment {

    int equipmentId;
    String name;
    double weight;
    String material;
    boolean isAdjustable;
    String category;
    String brand;

public void GetInfo(){

        System.out.println("Equipment ID: " +   equipmentId);
        System.out.println("Name: " +   name);
        System.out.println("Weight: " +   weight + " kg");
        System.out.println("Material: " +   material);
        System.out.println("Adjustable: " +   isAdjustable);
        System.out.println("Category: " +   category);
        System.out.println("Brand: " +   brand);
}
}
