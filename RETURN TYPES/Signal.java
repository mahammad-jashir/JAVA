class Signal {
    static String location;
    static int duration;
    static char currentLight;
    static boolean isWorking;
    static float height;

    public static String getLocation() {
        location = "Main Street";
        return location;
    }
    public static int getDuration() {
        duration = 60;
        return duration;
    }
    public static char getCurrentLight() {
        currentLight = 'G';
        return currentLight;
    }
    public static boolean isWorkingStatus() {
        isWorking = true;
        return isWorking;
    }
    public static float getHeight() {
        height = 4.5f;
        return height;
    }
}
