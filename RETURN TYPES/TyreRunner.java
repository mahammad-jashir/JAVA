class TyreRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = Tyre.getBrand();
        float diameter = Tyre.getDiameter();
        boolean tubeless = Tyre.isTubelessTyre();
        int warranty = Tyre.getWarrantyYears();
        double price = Tyre.getPrice();

        System.out.println("Brand: " + brand);
        System.out.println("Diameter: " + diameter);
        System.out.println("Is Tubeless: " + tubeless);
        System.out.println("Warranty: " + warranty);
        System.out.println("Price: " + price);
    }
}
