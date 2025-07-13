class Radio {
    static String brand;
    static int volumeLevel;
    static boolean isOn;
    static double frequency;
    static char band;
    
    public static String getBrand() {
        brand = "Sony";
        return brand;
    }
    public static int getVolumeLevel() {
        volumeLevel = 7;
        return volumeLevel;
    }
    public static boolean getIsOn() {
        isOn = true;
        return isOn;
    }
    public static double getFrequency() {
        frequency = 101.3;
        return frequency;
    }
    public static char getBand() {
        band = 'F';
        return band;
    }
}
