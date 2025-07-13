class WalkieTalkie {
    static String model;
    static int range;
    static boolean isEncrypted;
    static byte channels;
    static float frequency;

    public static String getModel() {
        model = "Motorola-X";
        return model;
    }
    public static int getRange() {
        range = 5;
        return range;
    }
    public static boolean isEncrypted() {
        isEncrypted = true;
        return isEncrypted;
    }
    public static byte getChannels() {
        channels = 16;
        return channels;
    }
    public static float getFrequency() {
        frequency = 446.0f;
        return frequency;
    }
}
