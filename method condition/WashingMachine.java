class WashingMachine {
    static boolean isOn;
    static int maxSpeed = 10;
    static int minSpeed;
    static int currentSpeed;

    public static void onOrOff() {
        if (isOn==false) {
            isOn = true;
            System.out.println("Washing Machine Turned On");
        } else {
            isOn = false;
            System.out.println("Washing Machine Turned Off");
        }
    }

    public static void increaseSpeed() {
        if (isOn==true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed=currentSpeed+1;
                System.out.println("Washing Speed: "+currentSpeed);
            } else {
                System.out.println("Max Speed Reached");
            }
        } else {
            System.out.println("Please turn on the washing machine");
        }
    }

    public static void decreaseSpeed() {
        if (isOn==true) {
            if (currentSpeed > minSpeed) {
                currentSpeed=currentSpeed-1;
                System.out.println("Washing Speed: "+currentSpeed);
            } else {
                System.out.println("Min Speed Reached");
            }
        } else {
            System.out.println("Please turn on the washing machine");
        }
    }
}
