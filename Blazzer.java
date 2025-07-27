class Blazzer {

Blazzer(){
    System.out.println("Constructor Invoked------------------------------------");

}
Blazzer(int size, String color,String fabric,String brand,double price,boolean hasInnerLining){
System.out.println("Blazzer parameter is invoked");
this.size=size;
this.color=color;
this.fabric=fabric;
this.brand=brand;
this.price=price;
this.hasInnerLining=hasInnerLining;;


}
    int size;
    String color;
    String fabric;
    String brand;
    double price;
    boolean hasInnerLining;
    

public void GetInfo(){
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Fabric: " + fabric);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " +price);
        System.out.println("Has Inner Lining: " +hasInnerLining);
}
}