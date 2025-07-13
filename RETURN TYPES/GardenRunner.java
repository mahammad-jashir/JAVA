class GardenRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = Garden.getName();
        double area = Garden.getArea();
        boolean hasFountain = Garden.hasFountain();
        int trees = Garden.getTrees();
        short benches = Garden.getBenches();

        System.out.println("Garden Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Has Fountain: " + hasFountain);
        System.out.println("Trees: " + trees);
        System.out.println("Benches: " + benches);
    }
}
