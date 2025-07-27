class GymEquipment {

    int equipmentId;
    String name;
    double weight;
    String material;
    boolean isAdjustable;
    String category;
    String brand;

    GymEquipment() {
        System.out.println("Constructor Invoked------------------------------------");
    }

    GymEquipment(int equipmentId, String name, double weight, String material, boolean isAdjustable, String category, String brand) {
        System.out.println("GymEquipment parameter is invoked");
        this.equipmentId = equipmentId;
        this.name = name;
        this.weight = weight;
        this.material = material;
        this.isAdjustable = isAdjustable;
        this.category = category;
        this.brand = brand;
    }

    public void GetInfo() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Material: " + material);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Category: " + category);
        System.out.println("Brand: " + brand);
        System.out.println("----------------------------------");
    }
}
