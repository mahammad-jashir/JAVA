class Tv {
    static boolean isOn;
    static int maxVolume = 15;
    static int minVolume;
    static int currentVolume;

    public static void onOrOff() {
        if (isOn==false) {
            isOn = true;
            System.out.println("TV Turned On");
        } else {
            isOn = false;
            System.out.println("TV Turned Off");
        }
    }

    public static void increaseVolume() {
        if (isOn==true) {
            if (currentVolume < maxVolume) {
                currentVolume=currentVolume+1;
                System.out.println("TV Volume: "+currentVolume);
            } else {
                System.out.println("Max Volume Reached");
            }
        } else {
            System.out.println("Please turn on the TV");
        }
    }

    public static void decreaseVolume() {
        if (isOn==true) {
            if (currentVolume > minVolume) {
                currentVolume=currentVolume-1;
                System.out.println("TV Volume: "+currentVolume);
            } else {
                System.out.println("Min Volume Reached");
            }
        } else {
            System.out.println("Please turn on the TV");
        }
    }
}
