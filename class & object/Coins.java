
class Coins {

    int coinId;              
    String country;          
    String metal;            
    double weight;           
    int yearOfMint;          
    boolean isRare;          
    String denomination;     

public void GetInfo(){

 	System.out.println("Coin ID: " +    coinId);
        System.out.println("Country: " +    country);
        System.out.println("Metal: " +    metal);
        System.out.println("Weight: " +    weight + "g");
        System.out.println("Year of Mint: " +    yearOfMint);
        System.out.println("Is Rare: " +    isRare);
        System.out.println("Denomination: " +    denomination);
}
}