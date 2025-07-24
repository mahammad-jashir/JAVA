class Jwellery {

    int jwelleryId;
    String type;              
    String material;      
    double weight;        
    double price;         
    boolean isAntique;        
    String designName; 

public void GetInfo(){

        System.out.println("ID: " +  jwelleryId);
        System.out.println("Type: " +  type);
        System.out.println("Material: " +  material);
        System.out.println("Weight: " +  weight + "g");
        System.out.println("Price: ₹" +   price);
        System.out.println("Antique: " +  isAntique);
        System.out.println("Design: " +   designName);  

}
}