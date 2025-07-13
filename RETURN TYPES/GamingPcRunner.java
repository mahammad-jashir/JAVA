class GamingPcRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = GamingPc.getBrand();
        int ram = GamingPc.getRam();
        boolean rgb = GamingPc.hasRGBLights();
        double price = GamingPc.getPrice();
        byte ports = GamingPc.getUsbPorts();

        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("RGB: " + rgb);
        System.out.println("Price: " + price);
        System.out.println("USB Ports: " + ports);
    }
}
