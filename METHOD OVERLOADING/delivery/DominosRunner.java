class DominosRunner {
    public static void main(String[] args) {
        String foodName = "Burger";
        double price = Dominos.search(foodName);
        System.out.println("The food price on "+foodName+" is " + price);
        double pricewithquantity = Dominos.search(foodName);
        int quantity=4;
                System.out.println("The food price of "+foodName+" with quantity "+quantity+" is  " +pricewithquantity);
    }


    
}
