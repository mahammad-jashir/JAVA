class Mixer {
    static boolean isOn;
    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int currentSpeed;

    public static void onOrOff() {
        if (isOn==false) {
            isOn = true;
            System.out.println("Mixer Turned On");
        } else {
            isOn = false;
            System.out.println("Mixer Turned Off");
        }
    }

    public static void increaseSpeed() {
        if (isOn==true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed=currentSpeed+1;
                System.out.println("Mixer Speed: " +currentSpeed);
            } else {
                System.out.println("Max Speed Reached");
            }
        } else {
            System.out.println("Please turn on the mixer");
        }
    }

    public static void decreaseSpeed() {
        if (isOn==true) {
            if (currentSpeed > minSpeed) {
                currentSpeed=currentSpeed-1;
                System.out.println("Mixer Speed: " +currentSpeed);
            } else {
                System.out.println("Min Speed Reached");
            }
        } else {
            System.out.println("Please turn on the mixer");
        }
    }
}
