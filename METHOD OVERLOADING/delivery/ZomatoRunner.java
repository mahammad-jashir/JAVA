class ZomatoRunner {
    public static void main(String[] args) {
        String foodName = "Egg Curry";
        double price = Zomato.search(foodName);
System.out.println("The food price of "+foodName+" is " +price);
         double priceWithQuantity=   Zomato.search(foodName);
int quantity =3;
        System.out.println("The food price of "+foodName+" with quantity "+quantity+" " +priceWithQuantity);
    }
}
