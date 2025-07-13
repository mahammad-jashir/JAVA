class WalkieTalkieRunner {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");

        String model = WalkieTalkie.getModel();
        int range = WalkieTalkie.getRange();
        boolean encrypted = WalkieTalkie.isEncrypted();
        byte channels = WalkieTalkie.getChannels();
        float frequency = WalkieTalkie.getFrequency();

        System.out.println("Model: " + model);
        System.out.println("Range: " + range);
        System.out.println("Is Encrypted: " + encrypted);
        System.out.println("Channels: " + channels);
        System.out.println("Frequency: " + frequency);
    }
}
