class Ac {
    static boolean isOn;
    static int maxTemp = 30;
    static int minTemp = 16;
    static int currentTemp = 24;

    public static void onOrOff() {
        if (isOn==false) {
            isOn = true;
            System.out.println("AC Turned On");
        } else {
            isOn = false;
            System.out.println("AC Turned Off");
        }
    }

    public static void increaseTemperature() {
        if (isOn==true) {
            if (currentTemp < maxTemp) {
               currentTemp=currentTemp+1;
                System.out.println("Temperature: " +currentTemp +"°C");
            } else {
                System.out.println("Max Temperature Reached");
            }
        } else {
            System.out.println("Please turn on the AC");
        }
    }

    public static void decreaseTemperature() {
        if (isOn==true) {
            if (currentTemp > minTemp) {
                currentTemp=currentTemp-1;
                System.out.println("Temperature: "+currentTemp +"°C");
            } else {
                System.out.println("Min Temperature Reached");
            }
        } else {
            System.out.println("Please turn on the AC");
        }
    }
}
