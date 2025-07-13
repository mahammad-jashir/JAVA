class RadioRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String brand = Radio.getBrand();
        System.out.println("Brand: " + brand);

        int volume = Radio.getVolumeLevel();
        System.out.println("Volume Level: " + volume);

        boolean isOn = Radio.getIsOn();
        System.out.println("Is Radio On? " + isOn);

        double frequency = Radio.getFrequency();
        System.out.println("Frequency: " + frequency + " MHz");

        char band = Radio.getBand();
        System.out.println("Band: " + band);
    }
}
