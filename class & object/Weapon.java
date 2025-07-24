class Weapon {
    int weaponId;
    String name;               
    String type;          
    double weight;         
    int damage;            
    boolean isAutomatic;
    String manufacturer;

public void GetInfo(){
        System.out.println("Weapon ID: " +  weaponId);
        System.out.println("Name: " +  name);
        System.out.println("Type: " +  type);
        System.out.println("Weight: " +  weight);
        System.out.println("Damage: " +  damage);
        System.out.println("Automatic: " +  isAutomatic);
        System.out.println("Manufacturer: " +  manufacturer);
        System.out.println("--------------------");
}
}