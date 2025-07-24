class HairClip {

    int clipId;
    String brand;
    String material;
    String color;
    double lengthInCm;
    boolean isDecorated;
    String clipType;

public void GetInfo(){

        System.out.println("Clip ID: " +  clipId);
        System.out.println("Brand: " +  brand);
        System.out.println("Material: " +  material);
        System.out.println("Color: " +  color);
        System.out.println("Length: " +  lengthInCm + " cm");
        System.out.println("Decorated: " +  isDecorated);
        System.out.println("Type: " +  clipType);
}
}