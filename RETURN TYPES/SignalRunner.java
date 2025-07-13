class SignalRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String loc = Signal.getLocation();
        int dur = Signal.getDuration();
        char light = Signal.getCurrentLight();
        boolean working = Signal.isWorkingStatus();
        float height = Signal.getHeight();

        System.out.println("Location: " + loc);
        System.out.println("Duration: " + dur);
        System.out.println("Current Light: " + light);
        System.out.println("Is Working: " + working);
        System.out.println("Height: " + height);
    }
}
