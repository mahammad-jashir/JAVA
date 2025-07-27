class Coins {
    
    Coins() {
        System.out.println("Constructor Invoked------------------------------------");
    }

    Coins(int coinId, String country, String metal, double weight, int yearOfMint, boolean isRare, String denomination) {
        System.out.println("Coins parameter is invoked");
        this.coinId = coinId;
        this.country = country;
        this.metal = metal;
        this.weight = weight;
        this.yearOfMint = yearOfMint;
        this.isRare = isRare;
        this.denomination = denomination;
    }

    int coinId;              
    String country;          
    String metal;            
    double weight;           
    int yearOfMint;          
    boolean isRare;          
    String denomination; 

    public void GetInfo() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Country: " + country);
        System.out.println("Metal: " + metal);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Year of Mint: " + yearOfMint);
        System.out.println("Rare: " + isRare);
        System.out.println("Denomination: " + denomination);
        System.out.println("----------------------------------");
    }
}
