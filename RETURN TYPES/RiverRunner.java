class RiverRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String name = River.getName();
        float length = River.getLength();
        boolean clean = River.isCleanRiver();
        int states = River.getStatesCovered();
        double depth = River.getDepth();

        System.out.println("River Name: " + name);
        System.out.println("Length: " + length);
        System.out.println("Is Clean: " + clean);
        System.out.println("States Covered: " + states);
        System.out.println("Depth: " + depth);
    }
}
