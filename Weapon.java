class Weapon {
    
    Weapon() {
        System.out.println("Weapon Default Constructor Invoked ------------------------");
    }

    Weapon(int weaponId, String name, String type, double weight, int damage, boolean isAutomatic, String manufacturer) {
        System.out.println("Weapon Parameterized Constructor Invoked");
        this.weaponId = weaponId;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.damage = damage;
        this.isAutomatic = isAutomatic;
        this.manufacturer = manufacturer;
    }
int weaponId;
    String name;               
    String type;          
    double weight;         
    int damage;            
    boolean isAutomatic;
    String manufacturer;

    public void GetInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Damage: " + damage);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("----------------------------------------------------------");
    }
}
