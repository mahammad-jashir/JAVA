class GiTag {

   
    GiTag() {
        System.out.println("Default constructor of GiTag is called");
    }

    GiTag(String productName, String state, String category,
          int yearOfRegistration, boolean isHandmade, String authority) {
        this.productName = productName;
        this.state = state;
        this.category = category;
        this.yearOfRegistration = yearOfRegistration;
        this.isHandmade = isHandmade;
        this.authority = authority;
    }
 String productName;
    String state;
    String category;
    int yearOfRegistration;
    boolean isHandmade;
    String authority;

    public void getInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("State: " + state);
        System.out.println("Category: " + category);
        System.out.println("Year of Registration: " + yearOfRegistration);
        System.out.println("Is Handmade: " + isHandmade);
        System.out.println("Authority: " + authority);
        System.out.println("------------------------------------");
    }
}
