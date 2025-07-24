class Flowers {
    int flowerId;
    String name;
    String color;
    boolean isFragrant;
    double pricePerStem;
    String origin;
    String season;

    public void getInfo() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Is Fragrant: " + isFragrant);
        System.out.println("Price Per Stem: " + pricePerStem);
        System.out.println("Origin: " + origin);
        System.out.println("Season: " + season);
    }
}
